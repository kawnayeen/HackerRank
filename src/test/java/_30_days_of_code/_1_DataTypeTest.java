package _30_days_of_code;

import _30_days_of_code.base.ConsoleOutputTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class _1_DataTypeTest extends ConsoleOutputTest {
    @Test
    public void testDataTypeConcat() {
        _1_DataType dataType = new _1_DataType();
        dataType.concatRespectiveType(12, 4.0, "is the best place to learn and practice coding!");
        assertEquals("16\n" +
                "8.0\n" +
                "HackerRank is the best place to learn and practice coding!\n", outContent.toString());
    }
}