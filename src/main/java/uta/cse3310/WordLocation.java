package uta.cse3310;

import java.util.ArrayList;

public class WordLocation {
    public String word;
    public Point start;
    public Point end;
    public Direction direction;
    public boolean found;
    public transient ArrayList<GridItem> letters = new ArrayList<>();
    
    public WordLocation(String word, Point start, Point end, Direction direction) {
        this.word = word;
        this.start = start;
        this.end = end;
        this.direction = direction;
    }
}
