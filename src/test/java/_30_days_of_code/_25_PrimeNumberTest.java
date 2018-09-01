package _30_days_of_code;

import org.junit.Assert;
import org.junit.Test;

public class _25_PrimeNumberTest {

    @Test
    public void twoIsPrime(){
        _25_PrimeNumber primeNumber = new _25_PrimeNumber();
        Assert.assertTrue(primeNumber.isPrime(2));
    }
    @Test
    public void testPrime(){
        _25_PrimeNumber primeNumber = new _25_PrimeNumber();
        Assert.assertFalse(primeNumber.isPrime(1));
        Assert.assertFalse(primeNumber.isPrime(4));
        Assert.assertFalse(primeNumber.isPrime(9));
        Assert.assertFalse(primeNumber.isPrime(16));
        Assert.assertFalse(primeNumber.isPrime(25));
        Assert.assertFalse(primeNumber.isPrime(36));
        Assert.assertFalse(primeNumber.isPrime(49));
        Assert.assertFalse(primeNumber.isPrime(64));
        Assert.assertFalse(primeNumber.isPrime(81));
        Assert.assertFalse(primeNumber.isPrime(100));
        Assert.assertFalse(primeNumber.isPrime(121));
        Assert.assertFalse(primeNumber.isPrime(144));
        Assert.assertFalse(primeNumber.isPrime(169));
        Assert.assertFalse(primeNumber.isPrime(196));
        Assert.assertFalse(primeNumber.isPrime(225));
        Assert.assertFalse(primeNumber.isPrime(256));
        Assert.assertFalse(primeNumber.isPrime(289));
        Assert.assertFalse(primeNumber.isPrime(324));
        Assert.assertFalse(primeNumber.isPrime(361));
        Assert.assertFalse(primeNumber.isPrime(400));
        Assert.assertFalse(primeNumber.isPrime(441));
        Assert.assertFalse(primeNumber.isPrime(484));
        Assert.assertFalse(primeNumber.isPrime(529));
        Assert.assertFalse(primeNumber.isPrime(576));
        Assert.assertFalse(primeNumber.isPrime(625));
        Assert.assertFalse(primeNumber.isPrime(676));
        Assert.assertFalse(primeNumber.isPrime(729));
        Assert.assertFalse(primeNumber.isPrime(784));
        Assert.assertFalse(primeNumber.isPrime(841));
        Assert.assertTrue(primeNumber.isPrime(907));
    }
}