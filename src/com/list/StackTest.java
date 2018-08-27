package com.list;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/8/27
 * Time: 10:26
 * To change this template use File | Settings | File Templates.
 */
public class StackTest {

    public static void main(String[] args) {
        Stack stack  = new Stack();
        stack.push("111");
        stack.push("222");
        stack.push("333");
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
