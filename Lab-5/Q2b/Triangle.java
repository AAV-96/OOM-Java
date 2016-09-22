import java.io.*;
import java.util.*;

public class Triangle extends Shape {
	public void area() {
		System.out.println("This is area method of: "+this.getClass());
	}

	public static void main(String args[]) {
		Triangle obj = new Triangle();
		obj.area();
		/*Shape obj1 = new Shape();  --error: Shape is abstract; cannot be instantiated
		obj1.area();*/
		Shape obj2 = new Triangle();
		obj2.area();
	}
}


