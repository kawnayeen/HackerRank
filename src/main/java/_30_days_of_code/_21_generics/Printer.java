package _30_days_of_code._21_generics;

import java.util.Arrays;

public class Printer<T> {
    public void printArray(T[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }
}
