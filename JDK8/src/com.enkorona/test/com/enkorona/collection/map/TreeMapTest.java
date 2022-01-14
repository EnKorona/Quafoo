package com.enkorona.collection.map;

import com.enkorona.collection.Student;
import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void treeMapTest() {
        TreeMap<Student,String> treeMap = new TreeMap<>(new Comparator<Student>() {
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
        treeMap.put(new Student("张三", 26,77),"Student1");
        treeMap.put(new Student("李四", 24,88),"Student2");
        treeMap.put(new Student("王五", 23,66),"Student3");
        treeMap.put(new Student("老六", 20,99),"Student4");

        treeMap.entrySet().stream().forEach(studentStringEntry -> {
            System.out.println(studentStringEntry.getValue());
        });
    }
}