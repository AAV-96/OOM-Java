package p2;
import p1.Example;
import java.io.*;
import java.util.*;

public class otherPackage extends Example2 {
	int n, n_pri, n_pro, n_pub;
	
	public otherPackage() {
		this.n = super.n;
		//this.n_pri = super.n_pri;
		this.n_pro = super.n_pro;
		this.n_pub = super.n_pub;
	}
	
	public void display() {
		System.out.println("def: "+n);
		System.out.println("pri: "+n_pri);
		System.out.println("pro: "+n_pro);
		System.out.println("pub: "+n_pub);
	}
	
	public static void main(String args[]) {
		//Example ex = new Example();
		otherPackage ob = new otherPackage();
		ob.display();
	}
}
