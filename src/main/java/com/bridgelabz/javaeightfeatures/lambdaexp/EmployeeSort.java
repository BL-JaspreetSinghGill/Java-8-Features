package com.bridgelabz.javaeightfeatures.lambdaexp;

import com.bridgelabz.javaeightfeatures.lambdaexp.models.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(5, "jaspreet"));
        list.add(new Employee(4, "bob"));
        list.add(new Employee(3, "angat"));
        list.add(new Employee(2, "xyz"));
        list.add(new Employee(1, "abc"));
        System.out.println("LIST BEFORE SORTING : "+list);

        Collections.sort(list, (e1, e2) -> (e1.id<e2.id)?-1:(e1.id>e2.id)?1:0);
        System.out.println("LIST AFTER SORTING : "+list);
        Collections.sort(list, (e1, e2) -> (e1.name.compareTo(e2.name)));
        System.out.println("LIST AFTER NAME SORTING : "+list);
    }
}