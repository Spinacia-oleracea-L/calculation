package org.chapter1.stack.and.queue;

import java.util.Stack;

/***
 * LeetCode
 * 剑指 Offer 30. 包含min函数的栈
 */
public class MyStack1 {

    /** initialize your data structure here. */
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    private int top;
    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int x) {
        if(this.stackMin.isEmpty()) {
            this.stackMin.push(x);
        } else if(x <= this.min()) {
            this.stackMin.push(x);
        }
        this.stackData.push(x);
    }

    public void pop() {
        if(this.stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        int value = this.stackData.pop();
        if(value == this.min()) {
            this.stackMin.pop();
        }
    }

    public int top() {
        return this.stackData.peek();
    }

    public int min() {
        if(this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();0
 */