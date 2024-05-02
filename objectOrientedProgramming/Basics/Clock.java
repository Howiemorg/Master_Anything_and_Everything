package Basics;

public class Clock {
    private int hours;
    public int minutes;
    protected int seconds;

    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void showTime(){
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(10, 10, 10);

        clock.showTime();
    }
}