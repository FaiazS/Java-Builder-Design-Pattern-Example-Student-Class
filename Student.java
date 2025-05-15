package com.scaler.CreationalDesignPatterns.BuilderDesignPattern;

public class Student {

    private String name;

    private String phoneNumber;

    private int age;

    private String batch;

    private double psp;

    public static class StudentClassBuilder {

        private String name;

        private String phoneNumber;

        private int age;

        private String batch;

        private double psp;


        public StudentClassBuilder setName(String name) {

            this.name = name;

            return this;

        }
        public String getName() {

            return name;
        }

        public StudentClassBuilder setPhoneNumber(String phoneNumber) {

            this.phoneNumber = phoneNumber;

            return this;

        }

        public String getPhoneNumber() {

            return phoneNumber;
        }

        public StudentClassBuilder setAge(int age) {

            this.age = age;

            return this;
        }

        public int getAge() {

            return age;
        }

        public StudentClassBuilder setBatch(String batch) {

            this.batch = batch;

            return this;
        }
        public String getBatch() {

            return batch;
        }

        public StudentClassBuilder setPsp(double psp) {

            this.psp = psp;

            return this;
        }

        public double getPsp() {

            return psp;
        }

        public Student build(){

            return new Student(this);
        }
    }


    private Student(StudentClassBuilder studentClassBuilder){

        this.name = studentClassBuilder.getName();

        this.phoneNumber = studentClassBuilder.getPhoneNumber();

        if(studentClassBuilder.getAge() > 100){

            throw new RuntimeException();
        }
        this.age = studentClassBuilder.getAge();

        this.batch = studentClassBuilder.getBatch();

        this.psp = studentClassBuilder.getPsp();
    }

    public static StudentClassBuilder studentClassBuilder(){

        return new StudentClassBuilder();
    }

}


