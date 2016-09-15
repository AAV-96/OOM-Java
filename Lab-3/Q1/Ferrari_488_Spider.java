import java.io.*;
import java.util.*;
	
public class Ferrari_488_Spider extends Ferrari {
	double avg, max, rpm;
	public void average() {
		avg = 20;
		System.out.println("avergae function overridden");
	}
	
	public void maxSpeed() {
		max = 20;
		System.out.println("maxSpeed function overridden");
	}
	
	public void Rpm(int a) {
		rpm = 20;
		System.out.println("Rpm function with 1 int argument");
	}
	
	public void Rpm() {
		rpm = 20;
		System.out.println("Rpm funtion with no argument");
	}
	
	public static void main(String args[]) {
		//System.out.println(getClass().getName());
		Ferrari_488_Spider obj = new Ferrari_488_Spider();
		System.out.println(obj.getClass().getName());
		obj.average();
		obj.maxSpeed();
		obj.Rpm();
		obj.Rpm(0);
	}
}
