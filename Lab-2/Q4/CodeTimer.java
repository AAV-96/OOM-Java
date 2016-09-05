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

public class CodeTimer {
    private long startTime, endTime;
    
    CodeTimer() {
        this.startTime = System.currentTimeMillis();
    }
    
    long start() {
      this.startTime = System.currentTimeMillis();
      return this.startTime;
    }
    
    long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }
    
    long getStartTime() {
        this.startTime = start(); 
        return this.startTime;
    }
    
    long getEndTime() {
        this.endTime = stop();
        return this.endTime;
    }
    
    long getElapsedTime() {
        return (this.startTime-this.endTime);
    }
    
    public static void main(String args[]) {
        CodeTimer obj = new CodeTimer();
//        System.out.println("Start Time = "+obj.getStartTime());
//        System.out.println("End Time = "+obj.getEndTime());
        System.out.println(obj.getElapsedTime());
        
    }
}
