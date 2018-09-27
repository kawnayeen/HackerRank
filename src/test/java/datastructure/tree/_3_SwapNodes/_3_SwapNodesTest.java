package datastructure.tree._3_SwapNodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class _3_SwapNodesTest {

    @Test
    public void swapNodes() {
        _3_SwapNodes swapNodes = new _3_SwapNodes();
        int[][] input = {
                {2, 3},
                {4, -1},
                {5, -1},
                {6, -1},
                {7, 8},
                {-1, 9},
                {-1, -1},
                {10, 11},
                {-1, -1},
                {-1, -1},
                {-1, -1}
        };
        int[] query = {2, 4};
        swapNodes.swapNodes(input, query);
    }
}