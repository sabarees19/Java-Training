import java.util.Scanner;

public class ZeroToEnd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			int k = s.nextInt();
			arr[i] = k;
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0)
				for (int j = 0; j <= n; j++) {
					arr[j] = arr[i];
					System.out.print(arr[j] + " ");
					count++;
					break;
				}
		}
		for (int i = 0; i < n - count; i++) {
			System.out.print(0 + " ");
		}
	}
}
