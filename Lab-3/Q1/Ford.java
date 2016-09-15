import java.io.*;
import java.util.*;

public class Ford implements Car {
	double avg, max, rpm;
	public void average() {
		this.avg = 300;
		System.out.println("avg = "+this.avg);
	}
	
	public void maxSpeed() {
		this.max = 300;
		System.out.println("max = "+this.max);
	}
	
	public void Rpm() {
		this.rpm = 5000;
		System.out.println("rpm = "+this.rpm);
	}
}
		
