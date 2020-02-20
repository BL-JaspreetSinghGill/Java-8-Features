package com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.function;

import com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.function.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentGrade {
    public static void main(String[] args) {
        Function<Student, String> f = student -> {
            return (student.getMarks()>=80)? "DIST":(student.getMarks()>=60)? "A":
            (student.getMarks()>=50)? "B":(student.getMarks()>=40)? "C":
            (student.getMarks()>=35)? "D": "FAIL";
        };

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "jaspreet", 25));
        list.add(new Student(2, "jas", 45));
        list.add(new Student(3, "bobby", 55));
        list.add(new Student(4, "bob", 65));
        list.add(new Student(5, "angat", 85));

        for (Student s: list) {
            System.out.println("STUDENT ID : "+s.getId());
            System.out.println("STUDENT NAME : "+s.getName());
            System.out.println("STUDENT MARKS : "+s.getMarks());
            System.out.println(f.apply(s));
            System.out.println("------------------");
        }
    }
}
