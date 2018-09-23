package algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _10_SherlockAndAnagramTest {
    _10_SherlockAndAnagram sherlockAndAnagram;

    @Before
    public void setUp() {
        sherlockAndAnagram = new _10_SherlockAndAnagram();
    }

    @Test
    public void testNoAnagram() {
        Assert.assertEquals(0, sherlockAndAnagram.sherlockAndAnagrams("abcd"));
    }

    @Test
    public void testAnagram(){
        Assert.assertEquals(5, sherlockAndAnagram.sherlockAndAnagrams("cdcd"));
    }
}