package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _47_LisaWorkbookTest {

    @Test
    public void workbook() {
        _47_LisaWorkbook lisaWorkbook = new _47_LisaWorkbook();
        int[] input = {4, 2, 6, 1, 10};
        Assert.assertEquals(4, lisaWorkbook.workbook(5, 3, input));
    }
}