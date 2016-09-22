import java.io.*;
import java.util.*;

public class Rectangle extends Shape {
	public void area() {
		System.out.println("This is area method of: "+this.getClass());
	}

	public static void main(String args[]) {
		Rectangle obj = new Rectangle();
		obj.area();
		/*Shape obj1 = new Shape();  --error: Shape is abstract; cannot be instantiated
		obj1.area();*/
		Shape obj2 = new Rectangle();
		obj2.area();
	}
}


