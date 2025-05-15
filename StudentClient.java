package com.scaler.CreationalDesignPatterns.BuilderDesignPattern;

public class StudentClient {

    public static void main(String[] args) {

        Student student = Student

                .studentClassBuilder()

                .setName("Sam")

                .setAge(30)

                .setPsp(99.0)

                .setBatch("Academy")

                .build();

        System.out.println("DEBUG");

    }
}
