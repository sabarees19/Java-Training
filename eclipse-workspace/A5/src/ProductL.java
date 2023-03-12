import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ProductL {

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
			int count = 1;
			for (int j = 0; j <n; j++) {
				if (i == j) {
					continue;
				} 
				else {
					count=count*l1.get(j);
					}
				}
				
			st1.push(count);
		}
//		int b = 18;
//		System.out.println(b/4);
		System.out.println(st1);
	}
}
