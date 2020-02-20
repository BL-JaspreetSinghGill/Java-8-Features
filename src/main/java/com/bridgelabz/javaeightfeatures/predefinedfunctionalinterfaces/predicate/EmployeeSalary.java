package com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.predicate;

import com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.predicate.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeSalary {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("jaspreet", 10000));
        list.add(new Employee("jas", 20000));
        list.add(new Employee("angat", 30000));
        list.add(new Employee("bobby", 40000));

        Predicate<Employee> p = e -> e.getSalary() > 15000;
        for (Employee emp: list) {
            if (p.test(emp)) {
                System.out.println(emp);
            }
        }
    }
}
