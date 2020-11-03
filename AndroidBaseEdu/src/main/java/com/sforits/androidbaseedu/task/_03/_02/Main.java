package com.sforits.androidbaseedu.task._03._02;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Tom", 12));
        people.add(new Person("Jack", 12));
        people.add(new Person("Rose", 12));
        System.out.println(people.toString());
    }
}
