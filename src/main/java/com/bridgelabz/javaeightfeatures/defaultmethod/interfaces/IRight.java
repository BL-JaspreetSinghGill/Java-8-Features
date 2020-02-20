package com.bridgelabz.javaeightfeatures.defaultmethod.interfaces;

public interface IRight {

    default void m1() {
        System.out.println("RIGHT INTERFACE M1 METHOD");
    }
}
