package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _1_GradingStudentsTest {
    @Test
    public void testGrading() {
        int[] earnedGrade = {73, 67, 38, 33};
        int[] expectedGrade = {75, 67, 40, 33};
        int[] actualGrade = new _1_GradingStudents().gradingStudents(earnedGrade);
        for (int i = 0; i < expectedGrade.length; i++) {
            Assert.assertEquals(expectedGrade[i], actualGrade[i]);
        }
    }
}