package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _45_HalloweenSaleTest {

    @Test
    public void howManyGames() {
        _45_HalloweenSale halloweenSale = new _45_HalloweenSale();
        Assert.assertEquals(7, halloweenSale.howManyGames(20, 3, 6, 85));
    }
}