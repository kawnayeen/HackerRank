package _java_badge;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTwoTest {

    @Test
    public void printSeries() {
        LoopTwo loopTwo = new LoopTwo();
        loopTwo.printSeries(5, 3, 5);
        System.out.println();
        loopTwo.printSeries(0, 2, 10);
    }
}