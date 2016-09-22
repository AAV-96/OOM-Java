import java.io.*;
import java.util.*;

public class MyProgram extends MathUtil {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
		double rad, cbrt, crcm, ar;
		System.out.println("Enter num and radius");
		num = sc.nextInt();
		rad = sc.nextDouble();
		MathUtil math = new MathUtil();
		System.out.println("Cube Root = "+math.cubeRoot(num));
		System.out.println("Circumference = "+math.circumference(rad));
		System.out.println("Area = "+math.area(rad));
	}
}

