package Patterns.strategy;

public class SlowReading implements ReadingStrategy{
    public void read(){
        System.out.println("Reading a page every 3 minutes.");
    }
}
