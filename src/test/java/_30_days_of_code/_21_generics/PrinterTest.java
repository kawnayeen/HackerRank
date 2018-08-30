package _30_days_of_code._21_generics;

import _30_days_of_code.base.ConsoleOutputTest;
import org.junit.Assert;
import org.junit.Test;

public class PrinterTest extends ConsoleOutputTest {
    @Test
    public void testGenericPrinting() {
        Printer<Integer> intPrinter = new Printer<>();
        Integer[] intArray = new Integer[2];
        intArray[0] = 1;
        intArray[1] = 4;
        intPrinter.printArray(intArray);

        Printer<String> stringPrinter = new Printer<>();
        String[] strArray = new String[2];
        strArray[0] = "a";
        strArray[1] = "d";
        stringPrinter.printArray(strArray);

        Assert.assertEquals("1\n4\na\nd\n", outContent.toString());
        Assert.assertEquals(1, Printer.class.getDeclaredMethods().length);
    }
}