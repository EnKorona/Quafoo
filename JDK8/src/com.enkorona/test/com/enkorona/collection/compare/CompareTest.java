package com.enkorona.collection.compare;

import org.junit.Test;

import java.util.*;

public class CompareTest {

    @Test
    public void comparableTest() {
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三", 26,77));
        stuList.add(new Student("李四", 24,88));
        stuList.add(new Student("王五", 23,66));
        stuList.add(new Student("老六", 20,99));

        System.out.println("原始数组：" + stuList);
        Collections.reverse(stuList);
        System.out.println("翻转数组：" + stuList);
        Collections.sort(stuList);
        // 默认按年龄从小到大排序
        System.out.println("默认排序：" + stuList);
    }

    @Test
    public void comparatorTest() {
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三", 26,77));
        stuList.add(new Student("李四", 24,88));
        stuList.add(new Student("王五", 23,66));
        stuList.add(new Student("老六", 20,99));

        System.out.println("原始数组：" + stuList);
        Collections.reverse(stuList);
        System.out.println("翻转数组：" + stuList);
        Collections.sort(stuList);
        // 默认按年龄从小到大排序
        System.out.println("默认排序：" + stuList);

        // 定制排序的用法
        Collections.sort(stuList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() > o2.getScore()) {
                    return 1;
                }
                if (o1.getScore() < o2.getScore()) {
                    return -1;
                }
                return 0;
            }
        });
        // 定制按成绩从小到大排序
        System.out.println("定制排序：" + stuList);
    }

}
