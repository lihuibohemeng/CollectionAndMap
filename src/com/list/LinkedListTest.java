package com.list;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/8/27
 * Time: 10:28
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList books = new LinkedList();
//        从队列尾部插入数据
        books.offer("疯狂java讲义");
        books.push("轻量级java EE企业应用实战");

        books.offerFirst("Anroid");
        for(int i = 0 ;i < books.size() ;i++){
            System.out.println(books.get(i));
        }

        //访问、并不删除栈顶的元素
        System.out.println(books.peekFirst());
        //访问、并不删除队列的最后一个元素
        System.out.println(books.peekLast());
        //将栈顶的元素弹出"栈"
        System.out.println(books.pop());
        //下面输出将看到队列中第一个元素被删除
        System.out.println(books);
        //访问、并删除队列的最后一个元素
        System.out.println(books.pollLast());
        //下面输出将看到队列中只剩下中间一个元素：
        //轻量级Java EE企业应用实战
        System.out.println(books);

    }
}
