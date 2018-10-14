package algorithm.greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _1_MarcCupWalkTest {

    @Test
    public void marcsCakewalk() {
        _1_MarcCupWalk marcCupWalk = new _1_MarcCupWalk();
        int[] input = {7, 4, 9, 6};
        Assert.assertEquals(79, marcCupWalk.marcsCakewalk(input));
    }
}