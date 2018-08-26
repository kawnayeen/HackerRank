package _30_days_of_code;

import _30_days_of_code.base.ConsoleOutputTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _0_HelloWorldTest extends ConsoleOutputTest {
    @Test
    public void testConsoleOutput() {
        _0_HelloWorld helloWorld = new _0_HelloWorld();
        helloWorld.printOutput("Kamarul Kawnayeen");
        assertEquals("Hello, World.\nKamarul Kawnayeen\n", outContent.toString());
    }
}