import java.util.Scanner;

public class CArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int k = s.nextInt();
			a[i] = k;
		}
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(a[0]<a[i]);
		}
	}
}
//for (int i = 0; i < a.length; i++) {
//	System.out.print(a[i]+" ");
//}
