package com.bridgelabz.javaeightfeatures.lambdaexp;

interface IPrintDummy {

    void displayMessage();
}

public class PrintMessage {
    public static void main(String[] args) {
        IPrintDummy i = () -> System.out.println("HELLO WORLD");
        i.displayMessage();
    }
}
