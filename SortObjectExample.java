package com.telran.org.lessonten;

import java.util.*;

public class SortObjectExample {

    public static void main(String[] args) {
        Person personOne = new Person("One", 20);
        Person personTwo = new Person("Two", 25);
        Person personThree = new Person("Three", 15);

        List<Person> personList = Arrays.asList(personOne, personTwo, personThree);

        for (int i = 0; i < personList.size(); i++){
            System.out.println(personList.get(i));
        }
        System.out.println();
        SortPersonByAge sortPesonByAge = new SortPersonByAge();
        Collections.sort(personList, sortPesonByAge);

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }

        System.out.println();
        Collections.sort(personList, new SortPersonByName());
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }
}
