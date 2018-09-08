package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _18_DrawingBookTest {
    @Test
    public void testDrawingBook() {
        _18_DrawingBook drawingBook = new _18_DrawingBook();
        Assert.assertEquals(1,drawingBook.pageCount(6,2));
        Assert.assertEquals(1,drawingBook.pageCount(6,5));
    }
}