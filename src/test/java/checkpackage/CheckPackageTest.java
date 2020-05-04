package checkpackage;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPackageTest {

    @Test
    public void getName() {
        CheckPackage checkPackage = new CheckPackage();
        Assert.assertEquals("Github Package", checkPackage.getName());
    }
}