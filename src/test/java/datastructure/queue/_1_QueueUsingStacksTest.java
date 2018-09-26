package datastructure.queue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class _1_QueueUsingStacksTest {

    @Test
    public void runQueries() {
        _1_QueueUsingStacks queueUsingStacks = new _1_QueueUsingStacks();
        List<String> queries = Arrays.asList(
                "1 42",
                "2",
                "1 14",
                "3",
                "1 28",
                "3",
                "1 60",
                "1 78",
                "2",
                "2"
        );
        queueUsingStacks.runQueries(queries);
    }
}