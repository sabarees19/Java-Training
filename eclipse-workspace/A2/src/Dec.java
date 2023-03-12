import java.util.Scanner;

public class Dec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			a[i]=b;
		}
		for (int i = 0; i < a.length-1; i+=2) {
			int x = a[i];
			int y = a[i+1];
			for (int j = 0; j < x; j++) {
				System.out.print(y+" ");
			}
		}
				
	 }
	
}
