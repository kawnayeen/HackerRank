package datastructure.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _3_BalanceBracketsTest {

    @Test
    public void isBalanced() {
        _3_BalanceBrackets balanceBrackets = new _3_BalanceBrackets();
        Assert.assertEquals("YES", balanceBrackets.isBalanced("({[]})"));
        Assert.assertEquals("YES", balanceBrackets.isBalanced("{[()]}"));
        Assert.assertEquals("NO", balanceBrackets.isBalanced("{[(])}"));
        Assert.assertEquals("YES", balanceBrackets.isBalanced("{{[[(())]]}}"));
        Assert.assertEquals("YES", balanceBrackets.isBalanced("{{([])}}"));
        Assert.assertEquals("NO", balanceBrackets.isBalanced("{{)[](}}"));
        Assert.assertEquals("YES",
                balanceBrackets.isBalanced("{(([])[])[]}"));
        Assert.assertEquals("NO",
                balanceBrackets.isBalanced("{(([])[])[]]}"));
        Assert.assertEquals("YES",
                balanceBrackets.isBalanced("{(([])[])[]}[]"));
    }
}