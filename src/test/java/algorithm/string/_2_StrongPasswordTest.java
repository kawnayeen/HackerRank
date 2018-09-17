package algorithm.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 17/9/18
 */
public class _2_StrongPasswordTest {
    @Test
    public void testStrongPassword() {
        _2_StrongPassword strongPassword = new _2_StrongPassword();
        Assert.assertEquals(1, strongPassword.minimumNumber(11, "#HackerRank"));
    }
}