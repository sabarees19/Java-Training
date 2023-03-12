import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class LongSub {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String k = s.next();
		int m = k.length();
		Set<Character> sv = new HashSet<Character>();
		LinkedList<Character> q = new LinkedList<Character>();
		for (char ch : k.toCharArray()) {
			q.add(ch);
		}
		int c = 1;
		int v =0;
		for (int i = 1; i <= m - 1; i++) {
			for (int j = i; j < m; j++) {
			if (q.get(i-1) ==q.get(j)) {
				break;
			}
			c += i;
			v += j;
			System.out.println(j);
			break;
		}break;
		}
		for (int j = c; j < v; j++) {
			sv.add(((LinkedList<Character>) q).get(j));
		}
		System.out.println(sv.size());
	}
}
