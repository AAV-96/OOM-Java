import java.io.*;
import java.util.*;

public class Employee extends Organisation {
	String name, sex, org, jobt, bday;
	
	
	public Employee(){}

	public Employee(int bxx) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, sex, jobtitle, organisation and birthday in order");
		name = sc.next();
		sex = sc.next();
		jobt = sc.next();
		org = sc.next();
		bday = sc.next();
	}

	public int compareEmp(Employee a, Employee b) {
		if ((a.name).compareToIgnoreCase(b.name) == 0) {
			if ((a.sex).compareToIgnoreCase(b.sex) == 0) {
				if ((a.jobt).compareToIgnoreCase(b.jobt) == 0) {
					if ((a.org).compareToIgnoreCase(b.org) == 0) {
						if ((a.bday).compareToIgnoreCase(b.bday) == 0) {
							return 1;
						}
					}
				}
			}
		}
		return 0;
	}
	public static void main(String args[]) {
		Employee obj1 = new Employee(0);
		Employee obj2 = new Employee(0);
		Employee ob = new Employee();
		
		int flag = ob.compareEmp(obj1, obj2);
		if (flag == 1) {
			System.out.println("Same Employee");
		} else {
			System.out.println("Different Employee");
		}
	}
}

		
		
