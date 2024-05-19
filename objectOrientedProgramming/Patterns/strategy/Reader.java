package Patterns.strategy;

public class Reader {
    ReadingStrategy readingStrategy;

    public Reader(){}

    public void setReadingStrategy(ReadingStrategy readingStrategy){
        this.readingStrategy = readingStrategy;
    }

    public void read(){
        readingStrategy.read();
    }
}
