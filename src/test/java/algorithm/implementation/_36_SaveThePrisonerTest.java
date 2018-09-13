package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;
import util.FileHelper;

import java.util.List;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 13/9/18
 */
public class _36_SaveThePrisonerTest {
    private static final String TEST_INPUT_FILE = "storage/algorithm/implementation/input05.txt";
    private static final String TEST_OUTPUT_FILE = "storage/algorithm/implementation/output05.txt";

    @Test
    public void testSaveThePrisoner() {
        _36_SaveThePrisoner saveThePrisoner = new _36_SaveThePrisoner();
        Assert.assertEquals(13, saveThePrisoner.saveThePrisoner(13, 26, 1));
        Assert.assertEquals(2, saveThePrisoner.saveThePrisoner(5, 2, 1));
        Assert.assertEquals(3, saveThePrisoner.saveThePrisoner(5, 2, 2));
        Assert.assertEquals(3, saveThePrisoner.saveThePrisoner(3, 7, 3));
        Assert.assertEquals(1, saveThePrisoner.saveThePrisoner(4, 4, 2));
        Assert.assertEquals(1, saveThePrisoner.saveThePrisoner(1, 4, 1));
        Assert.assertEquals(1, saveThePrisoner.saveThePrisoner(4, 5, 1));
        Assert.assertEquals(3, saveThePrisoner.saveThePrisoner(4, 4, 4));
        Assert.assertEquals(3, saveThePrisoner.saveThePrisoner(3, 4, 3));
        Assert.assertEquals(999999999, saveThePrisoner.saveThePrisoner(999999999, 999999999, 1));
        Assert.assertEquals(1, saveThePrisoner.saveThePrisoner(8, 117991680, 2));
        FileHelper fileHelper = new FileHelper();
        List<String> inputStrings = fileHelper.readLineByLine(TEST_INPUT_FILE);
        inputStrings.remove(0);
        List<String> outputStrings = fileHelper.readLineByLine(TEST_OUTPUT_FILE);
        for (int i = 0; i < inputStrings.size(); i++) {
            String[] input = inputStrings.get(i).split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int s = Integer.parseInt(input[2]);
            int output = Integer.parseInt(outputStrings.get(i));
            //System.out.println(inputStrings.get(i));
            Assert.assertEquals(output, saveThePrisoner.saveThePrisoner(n, m, s));
        }
    }
}