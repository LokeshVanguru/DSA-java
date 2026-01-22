// You are given an array of strings arr[] that represents a valid arithmetic expression 
// written in Reverse Polish Notation (Pefix Notation). 
// Your task is to evaluate the expression and return an integer representing its value.

import java.util.Stack;

class Solution {
    public int evaluatePrefix(String[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (!arr[i].equals("+") && !arr[i].equals("-") && 
                !arr[i].equals("*") && !arr[i].equals("/") && !arr[i].equals("^")) {
                stack.push(Integer.valueOf(arr[i]));
            }
            else {
                int a = stack.pop(); // first operand
                int b = stack.pop(); // second operand

                if (arr[i].equals("+")) {
                    stack.push(a + b);
                } 
                else if (arr[i].equals("-")) {
                    stack.push(a - b);
                } 
                else if (arr[i].equals("*")) {
                    stack.push(a * b);
                } 
                else if (arr[i].equals("/")) {
                    stack.push((int) Math.floor((double) a / b)); // floor division
                } 
                else if (arr[i].equals("^")) {
                    stack.push((int) Math.pow(a, b)); // exponentiation
                }
            }
        }
        return stack.pop(); // 
    }
}

// Time Complexity:O(n)
// Space Complexity:O(n)
