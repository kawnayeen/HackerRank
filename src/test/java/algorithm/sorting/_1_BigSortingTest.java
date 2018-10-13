package algorithm.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _1_BigSortingTest {

    @Test
    public void bigSorting() {
        _1_BigSorting bigSorting = new _1_BigSorting();
        String[] values = {"1111", "1", "1", "2", "4", "1", "4"};
        String[] sortedValues = bigSorting.bigSorting(values);
        Arrays.stream(sortedValues).forEach(System.out::println);
    }
}