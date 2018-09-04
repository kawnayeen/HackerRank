package algorithm.implementation;

public class _1_GradingStudents {
    private static final int MINIMUM_VALUE_FOR_ROUNDING = 38;

    int[] gradingStudents(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= MINIMUM_VALUE_FOR_ROUNDING && grades[i] % 5 >= 3) {
                grades[i] = ((grades[i] / 5) + 1) * 5;
            }
        }
        return grades;
    }
}
