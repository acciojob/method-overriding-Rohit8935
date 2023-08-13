package com.driver;


public class Main {
    public static void main(String[] args) {
        B objB=new B();
        System.out.println(objB.meth());
        A objA=new A();
        System.out.println(objA.meth());

    }

} class A{
    String meth(){
        return "invoking a method from class A";
    }
}
class  B extends A{
    @Override
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}