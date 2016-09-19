package p1;
import java.io.*;
import java.util.*;
	
public class Derived_Example extends Example {
	int n, n_pri, n_pro, n_pub;

	public Derived_Example() {
		this.n = super.n;
		//this.n_pri = super.n_pri; gives error
		this.n_pro = super.n_pro;
		this.n_pub = super.n_pub;
	}
	
	public void display(){
		System.out.println("default: "+this.n);
		System.out.println("private: "+this.n_pri); //value = 0
		System.out.println("protected: "+this.n_pro);
		System.out.println("public: "+this.n_pub);
	}
	
	public static void main(String args[]) {
		Derived_Example obj = new Derived_Example();
		obj.display();
	}
}
