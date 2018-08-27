package com.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/8/27
 * Time: 11:26
 * To change this template use File | Settings | File Templates.
 */
// HashSet的性能总是比TreeSet好(特别是最常用的添加、查询元素等操作)，
// 因为TreeSet需要额外的红黑树算法来维护集合元素的次序。只有当需要一个保
//  持排序的Set时，才应该使用TreeSet，否则都应该使用HashSet
//2) 对于普通的插入、删除操作，LinkedHashSet比HashSet要略慢一点，
// 这是由维护链表所带来的开销造成的。不过，因为有了链表的存在，
// 遍历LinkedHashSet会更快
class M{
    int age;
    public M(int age){
        this.age = age;
    }
    public String toString(){
        return  "M[age:"+age +"]";
    }
}
public class TreeSetCompartor {

    public static void main(String[] args) {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                M m1 = (M)o1;
                M m2 = (M)o2;
                return m1.age>m2.age ? -1 : m1.age < m2.age ?1:0;
            }
        });
        set.add(new M(5));
        set.add(new M(-3));
        set.add(new M(9));

        System.out.println(set);
    }
}
