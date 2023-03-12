import java.util.Scanner;
import java.util.Stack;

public class CountUC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: s = ");
		String str = sc.next();
		String s2 = "";
		int c1 = str.length();
		int c2 = 0;
		int c3 = 0;
		int output = 0;
		Stack<String> ab = new Stack<String>();
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < c1; i++) {
			for (int j = 0; j < str.length() - i; j++) {
				int k = i + j + 1;
				s2 = s2 + sb.substring(j, k);
				ab.push(sb.substring(j, k));
			}
		}
		int ans = s2.length();
		int bc = 0;
		for (int i = c1; i < ab.size(); i++) {
			char[] temp = ab.get(i).toCharArray();
			for (int j = 0; j < temp.length - 1; j++) {
				for (int j2 = j + 1; j2 < temp.length; j2++) {
					if (temp[j] == temp[j2])
						c3++;

				}

			}

		}
		ans = ans - (c3*2);
		System.out.print("Output: " + ans);
	}

}

//import java.util.Scanner;
//import java.util.Stack;
//
//public class CountUC {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input: s = ");
//		String str = sc.next();
//		String s2 = "";
//		int c1 = str.length();
//		int c2 = 0;
//		int c3 = 0;
//		int output = 0;
//		Stack<String> ab = new Stack<String>();
//		StringBuilder sb = new StringBuilder(str);
//		for (int i = 0; i < c1; i++) {
//			for (int j = 0; j < str.length() - i; j++) {
//				int k = i + j + 1;
//				s2 = s2 + sb.substring(j, k);
//				ab.push(sb.substring(j, k));
//			}
//		}
//		int ans = s2.length();
//		int bc = 0;
//		for (int i = c1; i < ab.size(); i++) {
//			char[] temp = ab.get(i).toCharArray();
//			for (int j = 0; j < temp.length; j++) {
//				if (temp.length == 2) {
//					for (int j2 = j + 1; j2 < temp.length; j2++) {
//						if (temp[j] != temp[j2])
//							c2++;
//
//					}
//				} else if(temp.length > 2)  {
//					for (int j2 = 0; j2 < temp.length; j2++) {
//						if (temp[j] != temp[j2])
//							c3++;
//					}
//				}
//			}
//		}
//		output = c1 + c3+c2;
//		System.out.println("Output: " + c2);
//		System.out.println("Output: " + c3);
//		System.out.println("Output: " + output);
//	}
//
//}
