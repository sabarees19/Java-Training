import java.util.Scanner;
import java.util.Stack;

public class Stocki {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		Stack l = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			a[i] = k;
		}
		int count =1;
		for (int i = n-1; i >= 0; i--) {
			count=1;
			for (int j = i-1; j >= 0; j--) {
				if (a[i] > a[j]) {
					count++;
					}
				else
					break;
			}
			l.push(count);
		}
		for (int i = a.length-1; i >= 0 ; i--) {
			System.out.print(l.get(i)+" ");
		}
			
	}
}
