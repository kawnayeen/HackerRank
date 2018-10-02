package datastructure.queue;

import java.util.List;
import java.util.Stack;

public class _1_QueueUsingStacks {
    private static final String ENQUEUE = "1";
    private static final String DEQUEUE = "2";

    public void runQueries(List<String> queries) {
        Stack<Integer> primaryStack = new Stack<>();
        Stack<Integer> backup = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (String query : queries) {
            if (query.startsWith(ENQUEUE)) {
                primaryStack.push(Integer.parseInt(query.substring(2)));
            } else if (query.startsWith(DEQUEUE)) {
                // this is kind of tricky to avoid timeout error
                // we are splitting the values in 2 stack
                // backup will contain the oldest at top and newest at bottom
                // when backup is fill up - primaryStack will be empty & we are not going to refill it
                // instead when backup will empty again, we will refill it from primary stack
                //
                // so in single word, once dequeue is called, backup & primary stack will hold all the element combined
                if (backup.isEmpty()) {
                    while (!primaryStack.isEmpty())
                        backup.push(primaryStack.pop());
                }
                if (!backup.isEmpty())
                    backup.pop();
            } else {
                if (backup.isEmpty()) {
                    while (!primaryStack.isEmpty())
                        backup.push(primaryStack.pop());
                }
                if (!backup.isEmpty()) {
                    builder.append(backup.peek());
                    builder.append("\n");
                }
            }
        }
        System.out.println(builder.toString());
    }
}
