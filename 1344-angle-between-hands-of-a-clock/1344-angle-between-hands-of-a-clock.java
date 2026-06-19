class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12){
            hour = 0;
        }
        double h = 30*hour+0.5*minutes;
        double m = 6.0*minutes;

        
        
        double diff = Math.abs(h-m);
        return Math.min(diff, 360-diff);
        
       
    }
}