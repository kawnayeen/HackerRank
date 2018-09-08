package algorithm.implementation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _17_AngryProfessorTest {
    _17_AngryProfessor angryProfessor;

    @Before
    public void init() {
        angryProfessor = new _17_AngryProfessor();
    }

    @Test
    public void testCaseZero() {
        int[] input = {-1, -3, 4, 2};
        Assert.assertEquals(_17_AngryProfessor.YES, angryProfessor.angryProfessor(3, input));
    }

    @Test
    public void testCaseOne() {
        int[] input = {0, -1, 2, 1};
        Assert.assertEquals(_17_AngryProfessor.NO, angryProfessor.angryProfessor(2, input));
    }
}