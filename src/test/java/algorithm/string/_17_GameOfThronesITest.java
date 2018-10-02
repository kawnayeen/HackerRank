package algorithm.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _17_GameOfThronesITest {

    @Test
    public void gameOfThrones() {
        _17_GameOfThronesI gameOfThronesI = new _17_GameOfThronesI();
        Assert.assertEquals("YES",gameOfThronesI.gameOfThrones("aaa"));
        Assert.assertEquals("NO",gameOfThronesI.gameOfThrones("abc"));
        Assert.assertEquals("YES",gameOfThronesI.gameOfThrones("aaabbbb"));
        Assert.assertEquals("NO",gameOfThronesI.gameOfThrones("cdefghmnopqrstuvw"));
    }
}