package Basics;

import java.time.LocalTime;

public class ClockInheritanceAndPolymorphism {
    public static void main(String[] args) {
        Clock clock = new Clock(14,18,35);
        NonMilitaryTimeClock nonMilitaryTimeClock = new NonMilitaryTimeClock(14, 20, 30);
        nonMilitaryTimeClock.showTime();
        // Polymorphism - We can create an object of the superclass, but with
        // a specific subclasses function: dynamic binding in action
        Clock clock2 = new NonMilitaryTimeClock(19,13, 32);
        clock2.setSeconds(3);
        clock2.showTime();
        clock2.setHours(16);
        clock.showTime();

        AlarmClock alarmClock = new AlarmClock(12, 12, 12);
        alarmClock.setAlarm(13, 14);
        alarmClock.showAlarm();
        alarmClock.alarm();
        alarmClock.turnOnAlarm();
        // Set the alarm to RIGHT NOW
        alarmClock.setAlarm(LocalTime.now().getHour(), LocalTime.now().getMinute());
        alarmClock.alarm();

        // Polymorphism again - AlarmClock is a subclass of Clock so we can set our Clock 
        // object equal to it. It can now use Alarm Clocks methods that have the same name
        clock = alarmClock;
        // Again dynamic binding - we originally had it using Clock's showTime method
        // but we changed it to AlarmClock at runtime. So, now it uses AlarmClock's showTime method
        clock.showTime();

        // However, since it is a Clock object, it can not use AlarmClock specific functions
        // like showAlarm()
        // clock.showAlarm();
    }
}
