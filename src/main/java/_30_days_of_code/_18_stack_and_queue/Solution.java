package _30_days_of_code._18_stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * kawnayeen
 * 30/8/18
 */
public class Solution {
    private Stack<Character> stack;
    private Queue<Character> queue;

    public Solution() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public void pushCharacter(Character character){
        stack.push(character);
    }

    public void enqueueCharacter(Character character){
        queue.add(character);
    }

    public Character popCharacter(){
        return stack.pop();
    }

    public Character dequeueCharacter() {
        return queue.remove();
    }
}
