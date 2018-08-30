package _30_days_of_code._18_stack_and_queue;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 30/8/18
 */
public class SolutionTest {
    @Test
    public void testStackAndQueue() {
        Solution solution = new Solution();
        solution.pushCharacter('K');
        solution.enqueueCharacter('K');
        solution.pushCharacter('M');
        solution.enqueueCharacter('M');
        Assert.assertEquals(new Character('M'), solution.popCharacter());
        Assert.assertEquals(new Character('K'), solution.dequeueCharacter());
        Assert.assertEquals(new Character('K'), solution.popCharacter());
        Assert.assertEquals(new Character('M'), solution.dequeueCharacter());
    }
}