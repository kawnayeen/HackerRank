package _30_days_of_code._29_BitwiseAnd;

import org.junit.Assert;
import org.junit.Test;
import util.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class _29_BitwiseAndTest {
    private static final String TEST_INPUT_FILE = "storage/30_days_of_code/day_29/input02.txt";
    private static final String TEST_OUTPUT_FILE = "storage/30_days_of_code/day_29/output02.txt";

    @Test
    public void testBitwiseAnd() {
        FileHelper fileHelper = new FileHelper();
        List<String> inputStrings = fileHelper.readLineByLine(TEST_INPUT_FILE);
        inputStrings.remove(0);
        List<Pair> pairs = new ArrayList<>();
        for (String input : inputStrings) {
            String[] split = input.split(" ");
            pairs.add(new Pair(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
        }
        _29_BitwiseAnd bitwiseAnd = new _29_BitwiseAnd();
        List<String> expectedOutputStrings = fileHelper.readLineByLine(TEST_OUTPUT_FILE);
        List<Integer> outputStrings = bitwiseAnd.findMaximumBitwiseAnd(pairs);
        for (int i = 0; i < expectedOutputStrings.size(); i++) {
            int expectedOutput = Integer.parseInt(expectedOutputStrings.get(i));
            int actualOutput = outputStrings.get(i);
            Assert.assertEquals(expectedOutput, actualOutput);
        }
    }

    @Test
    public void testDefectedInput() {
        List<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair(712, 704));
        _29_BitwiseAnd bitwiseAnd = new _29_BitwiseAnd();
        bitwiseAnd.findMaximumBitwiseAnd(pairs).forEach(System.out::println);
    }
}