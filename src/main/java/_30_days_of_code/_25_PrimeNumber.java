package _30_days_of_code;

import java.util.stream.IntStream;

public class _25_PrimeNumber {
    public boolean isPrime(int number) {
        if(number==2)
            return true;
        int maximumDivisor = (int) (Math.sqrt(number));
        return number > 1 &&
                IntStream.range(2, (maximumDivisor))
                        .noneMatch(i -> number % i == 0) && number % maximumDivisor != 0;
    }
}
