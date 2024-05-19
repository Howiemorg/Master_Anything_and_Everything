package Patterns.strategy;

public class ReaderCodedToImplementation {
    ReadingStrategy readingStrategy;

    public ReaderCodedToImplementation(ReadingStrategy readingStrategy){
        this.readingStrategy = readingStrategy;
    }

    public void read(){
        readingStrategy.read();
    }
}
