import com.address.Address;
import com.person.Person;
import java.io.*;
import java.util.*;
//import java.awt.*;

public class Employee{

	public String name, address;
	public int age;
	
	Employee() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, address and age");
		name = sc.nextLine();
		address = sc.nextLine();
		age = sc.nextInt();
		Person per = new Person(name, age);
		Address addr = new Address(address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Container con = new Container();
		Employee obj = new Employee();
//		con.add(new Address("Allahabad"), new Person("Ashwin", 20));
//		con.
//		Person obj = new Person("")
	}

}
