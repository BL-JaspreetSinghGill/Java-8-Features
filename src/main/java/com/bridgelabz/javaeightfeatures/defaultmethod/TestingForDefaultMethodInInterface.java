package com.bridgelabz.javaeightfeatures.defaultmethod;

import com.bridgelabz.javaeightfeatures.defaultmethod.interfaces.ILeft;
import com.bridgelabz.javaeightfeatures.defaultmethod.interfaces.IRight;

public class TestingForDefaultMethodInInterface implements ILeft, IRight {

    @Override
    public void m1() {
        System.out.println("IMPLEMENTED METHOD");
        ILeft.super.m1();
    }

    public static void main(String[] args) {
        TestingForDefaultMethodInInterface test = new TestingForDefaultMethodInInterface();
        test.m1();
    }
}
