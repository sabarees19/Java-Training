import java.util.*;

class Builder {
	char minm(String temp) {
		char min = 'z';
		int l1 = temp.length();
		for (int y = 0; y < l1; y++) {
			if (temp.charAt(y) < min)
				min = temp.charAt(y);
		}
		return min;
	}

	void deleteChar(StringBuilder sb, int l, char min) {
		for (int z = 0; z < l; z++) {
			if (sb.charAt(z) == min) {
				sb.deleteCharAt(z);
				break;
			}
		}
	}
}

public class StringPM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		int k = sc.nextInt();
		String x = "";
		int l = sb.length();
		Builder ca = new Builder();
		for (int i = 0; i < l; i++) {
			if (sb.length() < k) {
				String temp = sb.substring(0);
				char min = ca.minm(temp);
				x = x + min;
				ca.deleteChar(sb, l, min);
			} else {
				String temp = sb.substring(0, k);

				char min = ca.minm(temp);
				x = x + min;

				ca.deleteChar(sb, l, min);
			}

		}
		System.out.println(x);

	}

}