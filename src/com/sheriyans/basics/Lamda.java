package com.sheriyans.basics;


    import java.util.*;
    class Student{
        String name;
        int marks;

        Student(String name, int marks){
            this.name = name;
            this.marks = marks;
        }
    }


    public class Lamda {
        public static void main(String []args){
            ArrayList<Student> s = new ArrayList<>();
            s.add(new Student("pritam", 100));
            s.add(new Student("maruti", 99));
            s.add(new Student("om", 98));

            s.sort((a, b)-> b.marks - a.marks);  // lamda for the sorting

            //lamda for the printing

            s.forEach(
                    student -> System.out.println(
                            student.name +" "+ student.marks
                    )
            );


        }
    }

