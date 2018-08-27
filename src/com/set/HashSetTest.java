package com.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/8/27
 * Time: 10:37
 * To change this template use File | Settings | File Templates.
 */
class A{
    @Override
    public boolean equals(Object obj){
        return true;
    }

}
class B{
    @Override
    public int hashCode(){
        return 1;
    }
}
class C{
    @Override
    public boolean equals(Object obj){
        return true;
    }
    @Override
    public int hashCode(){
        return 2;
    }
}
//   Set集合中，hashcode决定元素存储的位置，equals决定元素是否可以存储
//    使用hash表进行存储 。元素顺序是无序的
public class HashSetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new A());
        set.add(new A());

        set.add(new B());
        set.add(new B());

        set.add(new C());
        set.add(new C());
        System.out.println(set);
    }
}
