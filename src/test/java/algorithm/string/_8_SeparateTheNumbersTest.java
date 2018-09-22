package algorithm.string;

import org.junit.Test;

public class _8_SeparateTheNumbersTest {
    @Test
    public void testSeparateNumber(){
        _8_SeparateTheNumbers separateTheNumbers = new _8_SeparateTheNumbers();
        separateTheNumbers.separateNumbers("1234");
        separateTheNumbers.separateNumbers("1237");
        separateTheNumbers.separateNumbers("1264");
        separateTheNumbers.separateNumbers("1213");
        separateTheNumbers.separateNumbers("121314");
        separateTheNumbers.separateNumbers("91011");
        separateTheNumbers.separateNumbers("00000000000000000000000000000000");
        separateTheNumbers.separateNumbers("429496729542949672964294967297");
        separateTheNumbers.separateNumbers("429496729542949672964294967296");
        separateTheNumbers.separateNumbers("429496729542949672964294967287");
        separateTheNumbers.separateNumbers("429496729542949672964294967197");
        separateTheNumbers.separateNumbers("42949672954294967296429496729");
        separateTheNumbers.separateNumbers("4294967295429496729642949672");
        separateTheNumbers.separateNumbers("429496729500000000000000000001");
        separateTheNumbers.separateNumbers("42949672950123456789");
        separateTheNumbers.separateNumbers("4294967295000010020030000456789");
        separateTheNumbers.separateNumbers("4294967295000102003004005");
    }
}