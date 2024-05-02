package Basics;

import java.time.LocalTime;

public class AlarmClock extends Clock {
    int alarmHours;
    int alarmMinutes;
    boolean alarmActivated;

    public AlarmClock(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
        alarmHours = 0;
        alarmMinutes = 0;
    }

    public void showTime() {
        int hours = this.getHours();
        String am_or_pm = "am";
        if(hours >= 12){
            if(hours != 12){
                hours %= 12;
            }
            am_or_pm = "pm";
        }
        
        System.out.println(hours + ":" + minutes + ":" + seconds + am_or_pm);
    }

    public void showAlarm(){
        int hours = alarmHours;
        String am_or_pm = "am";
        if(hours >= 12){
            if(hours != 12){
                hours %= 12;
            }
            am_or_pm = "pm";
        }
        
        System.out.println(hours + ":" + minutes + am_or_pm);
    }

    public void setHours(int hours){
        super.setHours(hours);
    }

    public void setAlarm(int hours, int minutes){
        // Now, we run into a problem. We want to make sure it is a valid hour
        // and minutes entered, but we already did this. Do we want to do it again?
        // No, lets make a new function in the Clock class and encapsulate it.
        alarmHours = hours;
        alarmMinutes = minutes;
    }

    public void turnOnAlarm(){
        alarmActivated = true;
    }

    public void turnOffAlarm(){
        alarmActivated = false;
    }

    public void alarm(){
        LocalTime time = LocalTime.now();
        if(alarmActivated && alarmHours == time.getHour() && alarmMinutes == time.getMinute()){
            System.out.println("BEEP BEEP BEEP");
        }else if(!alarmActivated){
            System.out.println("Alarm not activated!");
        }
    }
}
