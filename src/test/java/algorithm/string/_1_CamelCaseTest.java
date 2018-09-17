package algorithm.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 17/9/18
 */
public class _1_CamelCaseTest {
    @Test
    public void testCamelCase() {
        _1_CamelCase camelCase = new _1_CamelCase();
        Assert.assertEquals(5, camelCase.camelcase("saveChangesInTheEditor"));
    }
}