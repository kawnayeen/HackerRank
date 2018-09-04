package algorithm.warmup;

public class _10_TimeConversion {
    private static final String AM = "AM";
    private static final String PM = "PM";
    private static final String EMPTY_STRING = "";

    public String timeConversion(String s) {
        int hour = getHour(s);
        if (s.endsWith(AM)) {
            s = s.replace(AM, EMPTY_STRING);
            return adjustAM(hour, s);
        }
        s = s.replace(PM, EMPTY_STRING);
        return adjustPM(hour, s);
    }

    private int getHour(String s) {
        return Integer.parseInt(s.substring(0, 2));
    }

    private String adjustAM(int hour, String time) {
        if (hour == 12)
            return "00" + time.substring(2);
        return time;
    }

    private String adjustPM(int hour, String time) {
        if (hour == 12)
            return time;
        else
            return (hour + 12) + time.substring(2);
    }
}
