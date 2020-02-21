package com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.biconsumer;

import com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.biconsumer.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class EmployeeSalaryIncrement {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("jaspreet", 1000));
        list.add(new Employee("jas", 2000));
        list.add(new Employee("bob", 3000));

        BiConsumer<Employee, Double> c = (emp, sal) -> {
          emp.setSalary(emp.getSalary()+sal);
        };

        for (Employee e : list) {
            c.accept(e, 500.0);
            System.out.println(e);
        }
    }
}
