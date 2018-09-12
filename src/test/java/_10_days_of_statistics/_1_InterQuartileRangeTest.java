package _10_days_of_statistics;

import org.junit.Test;

import static org.junit.Assert.*;

public class _1_InterQuartileRangeTest {

    @Test
    public void prepareArray() {
        _1_InterQuartileRange interQuartile = new _1_InterQuartileRange();
        int[] input = {6, 12, 8, 10, 20, 16};
        int[] frequency = {5, 4, 3, 2, 1, 5};
        interQuartile.prepareArray(input, frequency);
    }

    @Test
    public void prepareArrayTwo() {
        _1_InterQuartileRange interQuartile = new _1_InterQuartileRange();
        int[] input = {10, 40, 30, 50, 20};
        int[] frequency = {1, 2, 3, 4, 5};
        interQuartile.prepareArray(input, frequency);
    }
}