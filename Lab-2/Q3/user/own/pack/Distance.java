package pack;
import java.io.*;
import java.util.*;

public class Distance {
	private double ft, in;

	public void set() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter feet and inches");
		this.ft = sc.nextDouble();
		this.in = sc.nextDouble();
	}

	public Distance getsum(Distance b) {
		Distance c = new Distance();
                c.ft = 0;
                c.in = 0;
		c.ft = this.ft+b.ft;
		c.in = this.in+b.in;
		return c;
	}

	/*public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Distance obj1, obj2, obj3;
		obj1 = new Distance();
		obj2 = new Distance();
		obj3 = new Distance();

		obj1.set();
		obj2.set();
		obj3 = obj1.getsum(obj2);

		System.out.println("Sum of feet = "+obj3.ft);
		System.out.println("Sum of Inches = "+obj3.in);
	}*/
}



