package com.sforits.androidbaseedu.book.example._06._12;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-19:11 Created by IntelliJ IDEA.
 */
public class Teacher implements Comparable {
    private String name;
    private Integer age;

    public Teacher(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Teacher t = (Teacher) o;
        // 定义比较方式 先比较age再比较name
        if (this.age-t.age>0){
            return 1;
        }
        if (this.age-t.age==0){
            return this.name.compareTo(t.name);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}