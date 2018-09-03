package datastructure.array;

import org.junit.Test;

public class _8_MinimumSwap2Test {
    @Test
    public void testMinSwap(){
        _8_MinimumSwap2 minSwap = new _8_MinimumSwap2();
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        System.out.println(minSwap.minimumSwap(arr));
    }

    @Test
    public void testTwo(){
        _8_MinimumSwap2 minSwap = new _8_MinimumSwap2();
        int[] arr = {2,3,4,1,5};
        System.out.println(minSwap.minimumSwap(arr));
    }

    @Test
    public void testThree(){
        _8_MinimumSwap2 minSwap = new _8_MinimumSwap2();
        int[] arr = {1,3,5,2,4,6,8};
        System.out.println(minSwap.minimumSwap(arr));
    }
}