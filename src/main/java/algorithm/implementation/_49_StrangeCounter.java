package algorithm.implementation;

import java.util.ArrayList;
import java.util.List;

class Tower {
    long startTime;
    long endTime;
    long value;
    long step;

    public Tower(long startTime, long endTime, long value, long step) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.value = value;
        this.step = step;
    }
}

public class _49_StrangeCounter {
    long strangeCounter(long t) {
        long endingValue = 0;
        long startingValue;
        for (long i = 0; ; i++) {
            long step = 3 * (long) Math.pow(2, i);
            startingValue = endingValue + 1;
            endingValue = endingValue + step;
            if (t >= startingValue && t <= endingValue)
                break;
        }
        return (endingValue - t) + 1;
    }
}
