package PackageCheck;

import Basics.Clock;

public class NotClockPackage {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setHours(8);
        // int seconds = clock.seconds;
        // int seconds = clock.getSeconds();
        clock.showTime();
        int minutes = clock.minutes;
        System.out.println(minutes);
    }
}
