package Patterns.strategy;

public class FastReader extends Reader {
    public FastReader(){
        readingStrategy = new FastReading();
    }
}
