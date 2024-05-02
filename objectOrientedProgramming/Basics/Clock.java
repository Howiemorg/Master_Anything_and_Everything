package Basics;

// Class
public class Clock {
    private int hours;
    public int minutes = 0;
    protected int seconds;

    public Clock() {
        hours = 0;
        seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds){
        setHours(hours);
        if(minutes < 0 || minutes > 59){
            System.out.println("The amount of minutes must be between 0 and 59 (inclusive)");
        }else{
            this.minutes = minutes;
        }
        if(seconds < 0 || seconds > 59){
            System.out.println("The amount of seconds must be between 0 and 59 (inclusive)");
        }else{
            this.seconds = seconds;
        }
    }

    public void showTime() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            System.out.println("The amount of hours must be between 0 and 23 (inclusive)");
            return;
        }
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            System.out.println("The amount of seconds must be between 0 and 59 (inclusive)");
            return;
        }
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}

class Main {
    public static void main(String[] args) {
        // Making a new Clock object by calling the Clock class
        Clock clock = new Clock();

        clock.showTime();
        clock.setHours(18);
        clock.showTime();
        clock.minutes = 45;
        clock.seconds = 13;
        clock.showTime();
        System.out.println(clock.getHours());
    }
}