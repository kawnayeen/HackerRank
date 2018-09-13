package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 13/9/18
 */
public class _36_SaveThePrisonerTest {
    @Test
    public void testSaveThePrisoner() {
        _36_SaveThePrisoner saveThePrisoner = new _36_SaveThePrisoner();
        Assert.assertEquals(3, saveThePrisoner.saveThePrisoner(4, 6, 2));
        Assert.assertEquals(2, saveThePrisoner.saveThePrisoner(5, 2, 1));
        Assert.assertEquals(3, saveThePrisoner.saveThePrisoner(5, 2, 2));
        Assert.assertEquals(3, saveThePrisoner.saveThePrisoner(3, 7, 3));
        Assert.assertEquals(1, saveThePrisoner.saveThePrisoner(4, 4, 2));
        Assert.assertEquals(1, saveThePrisoner.saveThePrisoner(1, 4, 1));
        Assert.assertEquals(4, saveThePrisoner.saveThePrisoner(4, 4, 1));
        Assert.assertEquals(999999999, saveThePrisoner.saveThePrisoner(999999999 ,999999999, 1));

    }
}