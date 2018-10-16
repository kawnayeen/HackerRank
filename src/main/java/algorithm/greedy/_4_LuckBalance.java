package algorithm.greedy;

import java.util.ArrayList;
import java.util.List;

public class _4_LuckBalance {
    private static final int IMPORTANT_CONTEST = 1;

    int luckBalance(int k, int[][] contests) {
        List<Integer> importantLuck = new ArrayList<>();
        List<Integer> nonImportantLuck = new ArrayList<>();
        int importantContests = 0;
        for (int[] entry : contests) {
            if (entry[1] == IMPORTANT_CONTEST) {
                importantLuck.add(entry[0]);
                importantContests++;
            } else
                nonImportantLuck.add(entry[0]);
        }
        if (k < importantContests) {
            int needToWin = importantContests - k;
            importantLuck.sort(Integer::compareTo);
            int losingLuck = 0;
            int winingLuck = 0;
            for (int i = 0; i < importantLuck.size(); i++) {
                if (i < needToWin)
                    losingLuck += importantLuck.get(i);
                else
                    winingLuck += importantLuck.get(i);
            }
            return nonImportantLuck.stream().mapToInt(Integer::intValue).sum() + winingLuck - losingLuck;
        }
        return nonImportantLuck.stream().mapToInt(Integer::intValue).sum()
                + importantLuck.stream().mapToInt(Integer::intValue).sum();
    }
}
