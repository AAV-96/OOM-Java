import java.io.*;
import java.util.*;

public class Typist extends Employee {
	String Emp_code, Emp_name, addr, phno;
	double basic, da, hra;

	Typist (String Emp_name, String Emp_code, String addr, String phno) {
		this.Emp_code = Emp_code;
		this.Emp_name = Emp_name;
		this.addr = addr;
		this.phno = phno;
	}

	public void calculate(double basic, double da, double hra) {
		super.calculate(basic, da, hra);
		this.basic = basic;
		//da = 0.1*basic;
		//hra = 0.2*basic;
		double salary = basic+(basic*da)+(basic*hra);
		System.out.println("Name: "+Emp_name);
		System.out.println("Code: "+Emp_code);
		System.out.println("Address: "+addr);
		System.out.println("Phone No. "+phno);
		System.out.println("Basic Pay: "+basic);
		System.out.println("DA "+da);
		System.out.println("HRA "+hra);
		System.out.println("Salary: "+salary);
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name, code, address, phone no. and basic pay of the employee");
		String name, code, address, phnum;
		name = sc.nextLine();
		code = sc.nextLine();
		address = sc.nextLine();
		phnum = sc.nextLine();
		Typist obj = new Typist(name, code, address, phnum);
		double b = sc.nextDouble();
		double da = 0.1*b;
		double hra = 0.2*b;
		obj.calculate(b, da, hra);
	}
}
