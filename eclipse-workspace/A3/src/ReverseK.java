import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseK {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int from = s.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < size; i++) {
			int k = s.nextInt();
			q.add(k);
		}
		for (int i = from-1; i >= 0; i--) {
			l.add(((LinkedList<Integer>)q).get(i));
		}
		for (int i = from; i < size; i++) {
			l.add(((LinkedList<Integer>) q).get(i));
		}
		System.out.print(l);
	}

}
