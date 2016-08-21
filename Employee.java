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

public class Employee {
    Scanner sc = new Scanner(System.in);
    double salary, bonus;
    int year;
    
    Employee () {        
        System.out.println("Enter Salary");
        salary = sc.nextDouble();
        
    }
    
    void display(int year) {
        this.year = year;
        if (this.year < 5) {
            bonus = 0.01*salary;
        } else {
            bonus = 0.02*salary;
        }
        System.out.println("Congratulations! Your bonus is Rs."+bonus);
    }
    
}
