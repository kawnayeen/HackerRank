package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 14/9/18
 */
public class _38_EncryptionTest {

    @Test
    public void encryption() {
        _38_Encryption encryption = new _38_Encryption();
        Assert.assertEquals("hae and via ecy", encryption.encryption("haveaniceday"));
        Assert.assertEquals("clu hlt io", encryption.encryption("chillout"));
    }
}