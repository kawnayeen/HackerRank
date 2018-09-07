package _10_days_of_statistics;

import org.junit.Test;

public class _1_QuartilesTest {
    @Test
    public void testQuartiles() {
        int[] input = {3, 7, 8, 5, 12, 14, 21, 13, 18};
        _1_Quartiles quartiles = new _1_Quartiles();
        quartiles.printQuartiles(input);
    }

    @Test
    public void testCaseOne() {
        int[] input = {3, 7, 8, 5, 12, 14, 21, 15, 18, 14};
        _1_Quartiles quartiles = new _1_Quartiles();
        quartiles.printQuartiles(input);
    }
}