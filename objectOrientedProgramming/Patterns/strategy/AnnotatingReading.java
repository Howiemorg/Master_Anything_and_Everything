package Patterns.strategy;

public class AnnotatingReading implements ReadingStrategy {
    public void read() {
        System.out.println("Annotating as I go.");
    }
}
