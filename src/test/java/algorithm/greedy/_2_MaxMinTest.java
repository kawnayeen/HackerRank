package algorithm.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class _2_MaxMinTest {

    @Test
    public void maxMin() {
        _2_MaxMin maxMin = new _2_MaxMin();
        int[] input = {10, 100, 300, 200, 1000, 20, 30};
        System.out.println(maxMin.maxMin(3, input));
    }
}