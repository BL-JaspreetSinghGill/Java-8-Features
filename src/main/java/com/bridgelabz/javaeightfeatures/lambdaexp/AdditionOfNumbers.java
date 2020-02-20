package com.bridgelabz.javaeightfeatures.lambdaexp;

interface IAdditionDemo {

    void add(int a, int b);
}

public class AdditionOfNumbers {
    public static void main(String[] args) {
        IAdditionDemo i = (a, b) -> System.out.println("The Sum is : "+(a+b));
        i.add(2, 3);
        i.add(10,20);
    }
}
