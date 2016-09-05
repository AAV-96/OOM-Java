/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iiita
 */
import java.io.*;
import java.util.*;

public class Student {
    private String rollno, name;
    private int age;
    
    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, age and rollno.");
        String name = sc.next();
        int age = sc.nextInt();
        String rollno = sc.next();
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    
    void setData(String name, int age, String rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;        
    }   
    
    void getData(){
        System.out.println("Name = "+name);
        System.out.println("Roll No. = "+rollno);
        System.out.println("Age = "+age);
    }
    
    public static void main(String args[]) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        obj1.setData();
        obj2.setData("AAV", 20, "iit2015104");
        obj1.getData();
        System.out.println("---------");
        obj2.getData();
    }
}
