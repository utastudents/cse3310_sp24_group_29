package uta.cse3310;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;

public class GameUnit2Test extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GameUnit2Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GameUnit2Test.class );
    }

    //Testing a player selecting the same point on the grid and different point 
    public void testGame2()
    {
        ArrayList<User> testPlayers = new ArrayList<User>(); 
        User p1 = new User();
        p1.name = "Test Player 1";
        User p2 = new User();
        p2.name = "Test Player 2";

        testPlayers.add(p1);
        testPlayers.add(p2);

        Game testGame = new Game(testPlayers);
        Point point = new Point();
        Point point2 = new Point();
        point.x = 2;
        point.y = 2;
        point2.x = 2;
        point2.y = 3;
        testGame.input( testPlayers.get(0), point);
        testGame.input( testPlayers.get(0), point2);

        assertTrue(testPlayers.get(0).selectedPoint == null);

        testGame.input( testPlayers.get(0), point);
        testGame.input( testPlayers.get(0), point);

        assertTrue(testPlayers.get(0).selectedPoint == null);
    }
}