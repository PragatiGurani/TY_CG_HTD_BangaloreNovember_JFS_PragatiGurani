package com.com.capgemini.stack;

import java.util.Stack;

public class Stack1 
{
 public static void main(String[] args)
 {
    Stack s1 = new Stack();
    s1.add(23);
    s1.add(56);
    s1.add(67);
    System.out.println(s1);
    s1.pop();
    System.out.println(s1);
    System.out.println(s1.peek());
    System.out.println(s1);
    System.out.println(s1.search(new Integer(23))); //according to insertion it counts so its 2
 }
}
