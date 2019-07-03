package algorithm.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class _53_RansomNoteTest {

    @Test
    public void checkMagazine() {
        _53_RansomNote ransomNote = new _53_RansomNote();
        ransomNote.checkMagazine(
                "two times three is not four".split(" "),
                "two times two is four".split(" ")
        );
    }
}