package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _27_AppendDeleteTest {
    @Test
    public void appendDeleteTest() {
        String source = "hackerhappy";
        String destination = "hackerrank";
        _27_AppendDelete appendDelete = new _27_AppendDelete();
        Assert.assertEquals(_27_AppendDelete.YES, appendDelete.appendAndDelete(source, destination, 9));
    }

    @Test
    public void testCase9() {
        String source = "abcdef";
        String destination = "fedcba";
        _27_AppendDelete appendDelete = new _27_AppendDelete();
        Assert.assertEquals(_27_AppendDelete.YES, appendDelete.appendAndDelete(source, destination, 15));
    }

    @Test
    public void testCase12() {
        String source = "aaa";
        String destination = "a";
        _27_AppendDelete appendDelete = new _27_AppendDelete();
        Assert.assertEquals(_27_AppendDelete.YES, appendDelete.appendAndDelete(source, destination, 5));
    }
}