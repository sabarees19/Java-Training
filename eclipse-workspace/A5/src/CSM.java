import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CSM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		int n = scan.nextInt();
		Stack st1 = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			int k = scan.nextInt();
			l1.add(k);
		}
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i; j <n; j++) {
				if (i == j) {
					continue;
				} else {
					if (l1.get(i) > l1.get(j)) {
						count++;
					}
				}
				
			}
			st1.push(count);
		}
		System.out.println(st1);
	}
}
