package _java_badge;

// https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Arrays;

public class Anagram {
    public String sortCharacter(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public boolean checkAnagram(String a, String b) {
        String sortedA = sortCharacter(a);
        String sortedB = sortCharacter(b);
        return sortedA.equals(sortedB);
    }
}
