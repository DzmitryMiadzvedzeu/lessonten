package com.telran.org.lessonten;

public class CompareObjectExample {

    public static void main(String[] args) {
        Cat catOne = new Cat();
        Cat catTwo = new Cat();

        boolean equals = catOne.equals(catTwo); // false
        boolean equals1 = catOne.equals(catOne); // true
    }
}
