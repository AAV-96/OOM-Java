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

public class Stamps {
    
//    int stp;
    
    Stamps(int pages) {
        if (pages > 15) {
            System.out.println("Cannot send the letter");
        } else if (pages%5 == 0) {
            System.out.println("No. of stamps required = "+(pages/5));
        } else {
            System.out.println("No. of stamps required = "+(((pages/5)+1)));
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of pages");
        int pages = sc.nextInt();
        if (pages <= 0){
            System.out.println("Cannot send the letter");
            System.exit(0);
        }
        Stamps obj = new Stamps(pages);
    }
    
}
