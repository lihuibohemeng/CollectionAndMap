package com.list;
import java.lang.String;

import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/8/27
 * Time: 9:58
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListTest {


      public static void main(String[] args){
          List<String> books = new ArrayList<String>();

          books.add(new String("轻量级Java EE企业应用实战"));
          books.add(new String("疯狂Java讲义"));
          books.add(new String("疯狂Andrioed讲义"));
          System.out.println(books);
          books.add(1,new String("设计模式"));
          for(int i =0; i <books.size();i++)
              System.out.println(books.get(i));

          books.remove(2);
          System.out.println(books);
//          输出位置
          System.out.println(books.indexOf(new String("设计模式")));
//          对数据进行更新
          books.set(1,new String("Little"));
          System.out.println(books);
//   将books集合的第二个元素（包括—）到第三个元素（不包括）截取成子集合。
          System.out.println(books.subList(1,2));
      }
}
