import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class LongsubQ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String k = s.next();
		int m = k.length();
		Stack<Character> sv = new Stack<Character>();
		Queue<Character> q = new LinkedList<Character>();
		for (char ch : k.toCharArray()) {
			q.add(ch);
		}
		int c = 0;
		for (int i = 1; i <= m - 1; i++) {
			if (((LinkedList<Character>) q).get(i-1) == ((LinkedList<Character>) q).get(i)) {
				break;
			}
			c = i;
			break;
		}
		System.out.println(c);
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < m; i++) {
			if(((LinkedList<Character>) q).get(j)!=((LinkedList<Character>) q).get(i))
			  sv.push(((LinkedList<Character>)q).get(j));
			continue;
		}}
		System.out.println(sv);
		System.out.println(sv.size());
	}
}
