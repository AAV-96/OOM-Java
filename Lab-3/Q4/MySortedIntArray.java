import java.io.*;
import java.util.*;

public class MySortedIntArray implements MyIntSet{
	static String s = "";
	public boolean member(int element) {
		String x = String.valueOf(element);
		//System.out.println(x);
		int idx = s.indexOf(x);
		//System.out.println(s.length());
		//System.out.println(idx);
		char ch = ' ';
		char chd = ' ';
		if (idx > 0) {
			chd = s.charAt(idx-1);
		}
		if ((idx+x.length()) < s.length()) {
			ch = s.charAt(idx+x.length());
		}
		if (idx >= 0 && ch == ' ' && chd == ' ') {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		//s = args[1];
		String a = args[0];
		//String abc = "";
		int aa = Integer.parseInt(a);
		FileInputStream fin;
		try {
			fin = new FileInputStream(args[1]);
			//System.out.println(new DataInputStream(fin).readLine());
			s = new DataInputStream(fin).readLine();
			fin.close();
		}
		catch (IOException e) {
			System.out.println("Error");
			System.exit(0);
		}

		MySortedIntArray obj = new MySortedIntArray();
		boolean bb = obj.member(aa);
		System.out.println(bb);
	}
}

