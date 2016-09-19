package p1;
import java.io.*;
import java.util.*;

public class Example {
	int n = 1;
	private int n_pri = 2;
	protected int n_pro = 3;
	public int n_pub = 4;
	
	public void display() {
		System.out.println("def: "+n);
		System.out.println("pri: "+n_pri);
		System.out.println("pro: "+n_pro);
		System.out.println("pub: "+n_pub);
	}
}
	//public static void main(String args[]) {
		
		
