package _30_days_of_code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _18_StackAndQueue {
    private Stack<Character> stack;
    private Queue<Character> queue;

    public _18_StackAndQueue() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
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
