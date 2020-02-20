package com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces;

import com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.function.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateAndFunctionAndConsumer {
    public static void main(String[] args) {
        Function<Student, String> f = student -> {
            return (student.getMarks()>=80)? "DIST":(student.getMarks()>=60)? "A":
                    (student.getMarks()>=50)? "B": "C";
        };

        Predicate<Student> p = s -> s.getMarks()>=40;

        Consumer<Student> c = stud -> {
            System.out.println("STUDENT ID : "+stud.getId());
            System.out.println("STUDENT NAME : "+stud.getName());
            System.out.println("STUDENT MARKS : "+stud.getMarks());
            System.out.println(f.apply(stud));
            System.out.println("------------------");
        };

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "jaspreet", 25));
        list.add(new Student(2, "jas", 45));
        list.add(new Student(3, "bobby", 55));
        list.add(new Student(4, "bob", 65));
        list.add(new Student(5, "angat", 85));

        for (Student s: list) {
            if (p.test(s)) {
                c.accept(s);
            }
        }
    }
}
