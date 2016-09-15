import java.io.*;
import java.util.*;
	
public class Mercedes_Benz_CLA extends Mercedes {
	double avg, max, rpm;
	public void average() {
		avg = 10;
		System.out.println("avergae function overridden");
	}
	
	public void maxSpeed() {
		max = 10;
		System.out.println("maxSpeed function overridden");
	}
	
	public void Rpm(int a) {
		rpm = 10;
		System.out.println("Rpm function with 1 int argument");
	}
	
	public void Rpm() {
		rpm = 10;
		System.out.println("Rpm funtion with no argument");
	}
	
	public static void main(String args[]) {
		
		Mercedes_Benz_CLA obj = new Mercedes_Benz_CLA();
		System.out.println(obj.getClass().getName());
		obj.average();
		obj.maxSpeed();
		obj.Rpm();
		obj.Rpm(0);
	}
}
