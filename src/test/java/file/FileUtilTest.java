package file;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileUtilTest {

    @Test
    public void readFile() {
        FileUtil fileUtil = new FileUtil();
        assertEquals(System.getProperty("user.dir"), fileUtil.readFile("abc.txt"));
    }
}