package com.bridgelabz.javaeightfeatures.lambdaexp;

interface ISquareDemo {

    int square(int number);
}

public class SquareOfNumber {
    public static void main(String[] args) {
        ISquareDemo i = number -> number*number;
        System.out.println("THE SQUARE : "+i.square(2));
        System.out.println("THE SQUARE : "+i.square(3));
    }
}
