package _java_badge;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class SubstringComparisonTest {

    @Test
    public void getSmallestSubstrings() {
        SubstringComparison substringComparison = new SubstringComparison();
        List<String> substrings = substringComparison.getSmallestSubstrings("welcometojava", 3);
        Collections.sort(substrings);
        System.out.println(substrings);
    }
}