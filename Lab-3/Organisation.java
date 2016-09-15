import java.io.*;
import java.util.*;

public class Organisation {
	private int empno;
	private String orgname;
	
	public Organisation(){}
	
	public Organisation(int axx) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Organisation name and no. of employees");
		orgname = sc.next();
		empno = sc.nextInt();
	}
	
	public int compareOrg(Organisation a, Organisation b) {
		if (((a.orgname).compareToIgnoreCase(b.orgname) == 0)) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static void main(String args[]) {
		Organisation ob1 = new Organisation(0);
		Organisation ob2 = new Organisation(0);
		Organisation obj = new Organisation();
		int flag = obj.compareOrg(ob1, ob2);
		if (flag == 1) {
			System.out.println("Same Organisation");
		} else {
			System.out.println("Different Organisation");
		}
	}
}
 
		
