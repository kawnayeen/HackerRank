package algorithm.implementation;

import java.util.ArrayList;
import java.util.List;

class Page {
    List<Integer> problems;

    public Page() {
        problems = new ArrayList<>();
    }

    void addProblem(int problem) {
        problems.add(problem);
    }

    boolean containProblem(int problem) {
        return problems.contains(problem);
    }
}

public class _47_LisaWorkbook {
    int workbook(int n, int k, int[] arr) {
        int specialProblem = 0;
        List<Page> pages = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int numberOfProblems = arr[i];
            Page page = new Page();
            pages.add(page);
            for (int j = 1; j <= numberOfProblems; j++) {
                page.addProblem(j);
                if (j % k == 0 & j < numberOfProblems) {
                    page = new Page();
                    pages.add(page);
                }
            }
        }
        for (int i = 0; i < pages.size(); i++) {
            if (pages.get(i).containProblem(i + 1))
                specialProblem++;
        }
        return specialProblem;
    }
}
