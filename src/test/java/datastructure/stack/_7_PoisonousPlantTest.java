package datastructure.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _7_PoisonousPlantTest {

    @Test
    public void poisonousPlants() {
        _7_PoisonousPlant poisonousPlant = new _7_PoisonousPlant();
        int[] input = {6, 5, 8, 4, 7, 10, 9};
        Assert.assertEquals(2, poisonousPlant.poisonousPlants(input));
    }
}