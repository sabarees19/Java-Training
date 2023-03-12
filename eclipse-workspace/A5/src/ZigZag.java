import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ZigZag {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		ArrayList<Character> l1 = new ArrayList<Character>();
		String str = scan.next();
		int m = str.length();
		char[] cc = new char[m];
		Stack st = new Stack<Character>();
		cc = str.toCharArray();
		for (int i = 0; i < m; i++) {
			l1.add(cc[i]);
		}
	}
}