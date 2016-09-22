import java.io.*;
import java.util.*;

public class Circle extends Shape {
	/*public void area() {
		System.out.println("This is area method of: "+this.getClass());
	}*/

	public static void main(String args[]) {
		Circle obj = new Circle();
		obj.getClass();
		/*Shape obj1 = new Shape();  --error: Shape is abstract; cannot be instantiated
		obj1.area();*/
		Shape obj2 = new Circle();
		obj2.area();
	}
}


