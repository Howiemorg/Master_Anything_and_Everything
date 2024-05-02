package PackageCheck;

import Basics.Clock;

public class NotClockPackage {
    public static void main(String[] args) {
        Clock clock = new Clock(12, 15, 9);

        // int seconds = clock.seconds;
        int seconds = clock.getSeconds();
        clock.showTime();
        int minutes = clock.minutes;
        System.out.println(minutes);
    }
}
