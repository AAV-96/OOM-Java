import java.io.*;
import java.util.*;

enum Season {
	WINTER(4), SPRING(2), SUMMER(4), FALL(2);


	//public class EnumExample {

	int dur;

	Season(int d) {
		dur = d;
	}

	public int getDuration() {
		return dur;
	}
}

public class EnumExample {
	public static void main(String args[]) {
		/*Season.WINTER = 4;
		  Season.SPRING = 2;
		  Season.SUMMER = 4;
		  Season.FALL = 2;*/
		for (Season s:Season.values()) {
			System.out.println("Season: "+s+" with duration: "+s.getDuration());
		}
		//System.out.println("Season: "
	}
}
