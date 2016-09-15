import java.io.*;
import java.util.*;

public abstract class Restaurant {
	//public String res, loc;// hpp;
	//public char hpp;
	public void display(String res) {
		System.out.println(res+" Restaurant");
	}

	abstract void totalPrice(double bill);
	//	double billf = bill + (bill*0.06);
	//	System.out.println("Bill with taxes = "+billf);
	
	
	abstract void menuItems(String menu);
	
	abstract void location(String loc);
	//	this.loc = loc;	
	
	abstract boolean hasPayPlace(char hpp);
}

	
	
	
