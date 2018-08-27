package com.map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/8/27
 * Time: 11:36
 * To change this template use File | Settings | File Templates.
 */
class A {
    int count;

    public A(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        return count == a.count;
    }

    @Override
    public int hashCode() {
        return count;
    }
}
class B
{
    //重写equals()方法，B对象与任何对象通过equals()方法比较都相等
    public boolean equals(Object obj)
    {
        return true;
    }
}
public class HashMapTest {
    public static void main(String[] args) {

//        hashtable的key和value都不许为空，
//        hashtable 直接使用了对象的hashcode值
//        hashmap对对象的hashcode值重新计算
        HashMap ht = new HashMap();
        ht.put(new A(60000) , "疯狂Java讲义");
        ht.put(new A(87563) , "轻量级Java EE企业应用实战");
        ht.put(new A(1232) , new B());
        System.out.println(ht);
     for(Object key : ht.keySet()){
         System.out.println(key);
         System.out.println(ht.get(key));
     }
    }
}
