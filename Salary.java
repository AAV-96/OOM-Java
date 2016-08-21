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

public class Salary extends Employee {
    Scanner sc = new Scanner(System.in); 
    int year;
    
    public Salary() {
        System.out.println("Enter the number of years of job");
        year = sc.nextInt();
        super.display(year);
    }
    
    public static void main(String args[]) {
        Salary obj = new Salary();
     
    }
}
