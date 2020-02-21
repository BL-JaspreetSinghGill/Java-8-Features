package com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.bifunction;

import com.bridgelabz.javaeightfeatures.lambdaexp.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class GetEmployeeUsingBiFunction {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        BiFunction<Integer, String, Employee> p = (id, name) -> new Employee(id, name);
        list.add(p.apply(1, "jaspreet"));
        list.add(p.apply(2, "jas"));
        list.add(p.apply(3, "bob"));

        for (Employee emp: list) {
            System.out.println(emp);
        }
    }
}
