import java.io.*;
import java.util.*;
	
public class Ford_300 extends Ford {
	double avg, max, rpm;
	public void average() {
		avg = 30;
		System.out.println("avergae function overridden");
	}
	
	public void maxSpeed() {
		max = 30;
		System.out.println("maxSpeed function overridden");
	}
	
	public void Rpm(int a) {
		rpm = 30;
		System.out.println("Rpm function with 1 int argument");
	}
	
	public void Rpm() {
		rpm = 30;
		System.out.println("Rpm funtion with no argument");
	}
	
	public static void main(String args[]) {
		
		Ford_300 obj = new Ford_300();
		System.out.println(obj.getClass().getName());
		obj.average();
		obj.maxSpeed();
		obj.Rpm();
		obj.Rpm(0);
	}
}
