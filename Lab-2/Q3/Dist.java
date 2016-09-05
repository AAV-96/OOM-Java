/* This program is currently store in the home directory. If stored in any other dir, then use
package <directoryname>;
Eg: package pro;
*/
import user.own.pack.Distance;
import java.io.*;
import java.util.*;

class Dist {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Distance obj1, obj2;
		obj1 = new Distance(0);
		obj2 = new Distance(0);
		Distance obj3 = obj1.getsum(obj2);

		System.out.println("Sum of feet = "+obj3.getft());
		System.out.println("Sum of Inches = "+obj3.getin());
	}
}
