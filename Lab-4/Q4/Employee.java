import java.io.*;
import java.util.*;

public class Employee {
	public String Emp_name, Emp_code, addr, phno;
	public double da, hra;
	
	public void calculate(double basic, double da, double hra) {
		//da = 0.1*basic;
		//hra = 0.2*basic;
		//System.out.println("This is the calcluate method of class Employee");	
		double salary = basic+basic*da+basic*hra;
		System.out.println("---------\nSUPERCLASS\nSalary: "+salary+"\n");
	}
}

