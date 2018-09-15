package algorithm.implementation;

import java.util.ArrayList;
import java.util.List;

public class _41_KaprekarNumbers {
    void kaprekarNumbers(int p, int q) {
        List<Long> numbers = new ArrayList<>();
        for (long i = p; i <= q; i++) {
            long square = i * i;
            if (square == i)
                numbers.add(i);
            else {
                String numStr = String.valueOf(i);
                String sqrStr = String.valueOf(square);
                if (sqrStr.length() > 1) {
                    String firstSplit = sqrStr.substring(0, numStr.length());
                    String secondSplit = sqrStr.substring(numStr.length());
                    int firstNum = Integer.parseInt(firstSplit);
                    int secondNum = Integer.parseInt(secondSplit);
                    if (firstNum > 0 && secondNum > 0 && (firstNum + secondNum) == i)
                        numbers.add(i);
                    else if (sqrStr.length() % 2 == 1) {
                        firstSplit = sqrStr.substring(0, sqrStr.length() - numStr.length());
                        secondSplit = sqrStr.substring(sqrStr.length() - numStr.length());
                        firstNum = Integer.parseInt(firstSplit);
                        secondNum = Integer.parseInt(secondSplit);
                        if (firstNum > 0 && secondNum > 0 && (firstNum + secondNum) == i)
                            numbers.add(i);
                    }
                }
            }
        }

        if (numbers.size() == 0) {
            System.out.println("INVALID RANGE");
        } else {
            StringBuilder builder = new StringBuilder();
            for (long val : numbers)
                builder.append(val + " ");
            System.out.println(builder.toString().trim());
        }
    }
}
