package Basics;

public class NonMilitaryTimeClock extends Clock {
    public NonMilitaryTimeClock(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
        this.setHours(this.getHours());
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

    public void setHours(int hours){
        super.setHours(hours);
    }
}
