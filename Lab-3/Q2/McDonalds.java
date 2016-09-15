import java.io.*;
import java.util.*;

public class McDonalds extends Restaurant {
	public String res, loc;//, hpp;
	public char hpp;
	static Scanner sc = new Scanner(System.in);
	public McDonalds() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the restaurant");
		res = sc.nextLine();
		System.out.println("Enter location and does it have pay place? y/n");
		loc = sc.nextLine();
		hpp = sc.next().charAt(0);
	}
	
	public void totalPrice(double bill) {
		System.out.println("Enter the bill amount");
		double billu = sc.nextDouble();
		double billf = billu + (billu*0.06);
		System.out.println("Bill with taxes = "+billf);
	}
	
	public void menuItems(String menu) {
		System.out.println(menu);
	}
	
	public void location(String loc) {
		this.loc = loc;
		System.out.println("Location of the Restaurant: "+this.loc);
	}	

	public boolean hasPayPlace(char hpp) {
		if (hpp == 'y' || hpp == 'Y') {
			return true;
		} else {
			return false;
		}
	}
	
	public void display() {
		super.display(res);
	}
	
	/*public void order() {
		System.out.println("Enter your order one by one: n to end"); BILLING METHOD YET TO BE CREATED
		String s[] = new String;
	}*/
	
	public static void main(String args[]) {
		McDonalds obj = new McDonalds();
		String menu = "Burger \t 20.00\nPizza \t 100.00\nMcPuff \t 30.00";
		obj.display();
		obj.location(obj.loc);
		obj.menuItems(menu);
		obj.totalPrice(100);
		boolean b = obj.hasPayPlace(obj.hpp);
		if (b) {
			System.out.println("PayPlace available");
		} else {
			System.out.println("PayPlace not available");
		}
	}
}
		
		
		
