package datastructure.stack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * kawnayeen
 * 26/9/18
 */
public class _4_SimpleTextEditor {
    private static final String APPEND = "1 ";
    private static final String DELETE = "2 ";
    private static final String PRINT = "3 ";

    public void runQueries(ArrayList<String> queries) {
        Stack<String> states = new Stack<>();
        String currentState = "";
        states.push(currentState);
        StringBuilder builder = new StringBuilder();
        for (String query : queries) {
            if (query.startsWith(APPEND)) {
                states.push(currentState);
                currentState = currentState + query.substring(2);
            } else if (query.startsWith(DELETE)) {
                states.push(currentState);
                int deleteLengthFromEnd = Integer.parseInt(query.substring(2));
                if (deleteLengthFromEnd >= currentState.length())
                    currentState = "";
                else
                    currentState = currentState.substring(0, currentState.length() - deleteLengthFromEnd);
            } else if (query.startsWith(PRINT)) {
                int charToPrint = Integer.parseInt(query.substring(2));
                builder.append(currentState.charAt(charToPrint - 1)).append("\n");
            } else {
                currentState = states.pop();
            }
        }
        System.out.println(builder.toString().trim());
    }
}
