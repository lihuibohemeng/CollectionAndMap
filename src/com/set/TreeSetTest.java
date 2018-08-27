package com.set;

import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/8/27
 * Time: 11:10
 * To change this template use File | Settings | File Templates.
 */
class D implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
public class TreeSetTest {
//    当需要把一个对象放入TreeSet中，重写该对象对应类的equals()方法时，
// 应该保证该方法与compareTo(Object obj)方法有一致的结果，
// 即如果两个对象通过equals()方法比较返回true时，
// 这两个对象通过compareTo(Object obj)方法比较结果应该也为0(即相等)
// treeSet 有两种排序方式 ：自然排序 和定制排序
//    把一个对象加入 TreeSet 该对象必须实现comparable接口,否则会抛出异常

    public void test(){
        TreeSet set = new TreeSet();

    }
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
//        treeSet.add(-1);
//        treeSet.add(3);
//        treeSet.add(2);
//        treeSet.add(-10);
////        [-10, -1, 2, 3]  会对组内元素进行排序
//        System.out.println(treeSet);
//
//
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());
//        //返回小于4的子集，不包含4
//        System.out.println(treeSet.headSet(4));
//
//        //返回大于5的子集，如果Set中包含5，子集中还包含5
//        System.out.println(treeSet.tailSet(5));
//
//        //返回大于等于-3，小于4的子集。
//        System.out.println(treeSet.subSet(-3 , 4));

        treeSet.add(new D());
    }
}
