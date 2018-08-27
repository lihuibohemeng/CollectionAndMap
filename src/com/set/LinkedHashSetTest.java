package com.set;

import java.util.LinkedHashSet;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/8/27
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
//  保证元素的插入顺序
public class LinkedHashSetTest {

    public static void main(String[] args) {
        LinkedHashSet books = new LinkedHashSet();

        books.add("aaa");
        books.add("bbb");
        books.add("ccc");
        System.out.println(books);

        books.remove("aaa");
        books.add("aaa");
        System.out.println(books);
    }
}
