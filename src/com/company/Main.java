package com.company;

public class Main {
    int id;
    String name;

    public static void main(String[] args) {
	// main function under Main class
        // in java method is like a function which expose the behaviour of obj

        Main s1 = new Main(); // we have created a object of main i.e ex student

        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}

// this program demonstrate having a main method

//class Student{
//    int id;
//    String name;
//}
//class TestStudent1{
//    public static void main(String args[]){
//        Student s1=new Student();
//        System.out.println(s1.id);
//        System.out.println(s1.name);
//    }
//}
