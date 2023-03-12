import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class LongPS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> l1 = new ArrayList<Character>();
		String str = scan.next();
		int m = str.length();
		char[] cc = new char[m];
		Stack st1 = new Stack<Integer>();
		cc=str.toCharArray();
		for (int i = 0; i < m; i++) {
			l1.add(cc[i]);
		}
		int count=0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (i == j) {
					continue;
				} else {
					if (l1.get(i) == l1.get(j)) {
						st1.push(l1.get(i));
						count++;
						break;
					}
				}	
			}
			
		}
		for (int i = count-1; i < count; i++) {
			if(count>2 )
			st1.pop();		}
		System.out.println(st1);
	}
}
