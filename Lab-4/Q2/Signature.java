import java.io.*;
import java.util.*;

public class Signature {
	public static void main(String args[]) {
		System.out.println("Name: Ashwin A. Vardhan");
		System.out.println("Email: iit2015104@iiita.ac.in");
		System.out.println("Ph No.: 08604616966");
		
		System.out.println("Arg1: "+args[0]);
		System.out.println("Arg2: "+args[1]);
		System.out.println("Arg3: "+args[2]);
		/*Instead of directly using args[0] etc., we can use a for loop too.
		for (int i=0; i<args.length; i++) {
			System.out.println("Arg"+(i+1)+" "+args[i]);
		}*/
	}
}
