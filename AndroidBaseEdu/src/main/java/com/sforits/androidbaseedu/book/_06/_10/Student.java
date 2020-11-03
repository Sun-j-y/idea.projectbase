package com.sforits.androidbaseedu.book._06._10;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-13:38 Created by IntelliJ IDEA.
 */
public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // 判断是否为同一个对象 比对的是地址
            return true;
        }
        if (!(obj instanceof Student)) { // 判断obj是否为Student对象
            return false;   // 如果不是 返回false
        }
        Student stu = (Student) obj;
        return this.id.equals(stu.getId()); // 返回id值是否相等
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}