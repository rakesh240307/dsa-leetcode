class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int hour = Integer.parseInt(startTime.substring(0,2));
int minute = Integer.parseInt(startTime.substring(3,5));
int second = Integer.parseInt(startTime.substring(6,8));
        int hour1 = Integer.parseInt(endTime.substring(0,2));
int minute1 = Integer.parseInt(endTime.substring(3,5));
int second1 = Integer.parseInt(endTime.substring(6,8));
        int k = 60*60*hour + 60*minute + second;
        int kk = 60*60*hour1 + 60*minute1 + second1;
        return kk-k;
        
    }
}