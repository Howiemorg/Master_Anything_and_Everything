package Patterns.strategy;

public class FastReading implements ReadingStrategy{
    public void read(){
        System.out.println("Reading at 1 page per minute!");
    }
}
