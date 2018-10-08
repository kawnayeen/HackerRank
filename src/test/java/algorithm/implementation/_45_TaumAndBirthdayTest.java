package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 2/10/18
 */
public class _45_TaumAndBirthdayTest {

    @Test
    public void taumBday() {
        _45_TaumAndBirthday taumAndBirthday = new _45_TaumAndBirthday();
        Assert.assertEquals(20, taumAndBirthday.taumBday(10, 10, 1, 1, 1));
        Assert.assertEquals(37, taumAndBirthday.taumBday(5, 9, 2, 3, 4));
        Assert.assertEquals(12, taumAndBirthday.taumBday(3, 6, 9, 1, 1));
        Assert.assertEquals(35, taumAndBirthday.taumBday(7, 7, 4, 2, 1));
        Assert.assertEquals(12, taumAndBirthday.taumBday(3, 3, 1, 9, 2));
        Assert.assertEquals(18192035842l, taumAndBirthday.taumBday(27984, 1402, 619246 ,615589 ,247954));
    }
}