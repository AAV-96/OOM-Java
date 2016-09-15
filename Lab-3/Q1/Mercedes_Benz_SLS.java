import java.io.*;
import java.util.*;
	
public class Mercedes_Benz_SLS extends Mercedes {
	double avg, max, rpm;
	public void average() {
		avg = 0;
		System.out.println("avergae function overridden");
	}
	
	public void maxSpeed() {
		max = 0;
		System.out.println("maxSpeed function overridden");
	}
	
	public void Rpm(int a) {
		rpm = 0;
		System.out.println("Rpm function with 1 int argument");
	}
	
	public void Rpm() {
		rpm = 0;
		System.out.println("Rpm funtion with no argument");
	}

	public static void main(String args[]) {
		
		Mercedes_Benz_SLS obj = new Mercedes_Benz_SLS();
		System.out.println(obj.getClass().getName());
		obj.average();
		obj.maxSpeed();
		obj.Rpm(0);
		obj.Rpm();
	}
}
