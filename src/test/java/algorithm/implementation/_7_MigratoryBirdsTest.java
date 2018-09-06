package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 6/9/18
 */
public class _7_MigratoryBirdsTest {

    @Test
    public void migratoryBirds() {
        _7_MigratoryBirds migratoryBirds = new _7_MigratoryBirds();
        List<Integer> sightings = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
        Assert.assertEquals(3, migratoryBirds.migratoryBirds(sightings));
    }
}