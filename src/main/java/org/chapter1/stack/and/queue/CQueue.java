package org.chapter1.stack.and.queue;

import java.util.Stack;

/***
 * LeetCode
 * 剑指 Offer 09. 用两个栈实现队列
 */
class CQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public CQueue() {
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    public void appendTail(int value) {
        this.stackPush.push(value);
    }

    public int deleteHead() {
        if(stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty! ");
        } else if(stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }


    public int peek() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty! ");
        } else if (stackPop.empty()) {
            while (! stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */