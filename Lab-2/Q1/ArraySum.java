import java.io.*;
import java.util.*;

public class ArraySum {
    
    long arrsum(int []arr, int flag) {
        long sum = 0;
        if (flag == 1) {
//        sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
//        return sum;
        } else if (flag == 2) {
//            sum = 0;
        for (int i=0; i<5; i++) {
            sum += arr[i];
        }
//        return sum;
        } else if (flag == 3) {
//            sum = 0;
        for (int i=5; i<10; i++) {
            sum += arr[i];
        }
//        return sum;
        }
        return sum;
    }
    
    
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the elements of the array");
        for (int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the flag value: 1 for all; 2 for first 5; 3 for last 5");
        int flag = sc.nextInt();
        ArraySum obj = new ArraySum();
        long sum = obj.arrsum(arr, flag);
        System.out.println("Sum = "+sum);
    }
    
    
}
