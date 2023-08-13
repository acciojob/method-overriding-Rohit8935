package com.driver;


class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println(objA.meth()); // Task 3

        B objB = new B(); // Task 2
        System.out.println(objB.meth()); // Task 5
    }
}