import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;

public class Iso {

	public static void main(String[] args) {
		Scanner vk = new Scanner(System.in);
//		int a, A = 1;
//		int b, B = 2;
//		int c, C = 3;
//		int d, D = 4;
//		int e, E = 5;
//		int f, F = 6;
//		int g, G = 7;
//		int h, H = 8;
//		int i, I = 9;
//		int j, J = 10;
//		int k, K = 11;
//		int l, L = 12;
//		int m, M = 13;
//		int n, N = 14;
//		int o, O = 15;
//		int p, P = 16;
//		int q, Q = 17;
//		int r, R = 18;
//		int s, S = 19;
//		int t, T = 20;
//		int u, U = 21;
//		int v, V = 22;
//		int w, W = 23;
//		int x, X = 24;
//		int y, Y = 25;
//		int z, Z = 26;

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int nn = vk.nextInt();
		String[] st = new String[nn];
		String[] sv = new String[nn];
		char[] cc = null;
		Stack st1 = new Stack<Integer>();
		Stack st2 = new Stack<Integer>();
		for (int ii = 0; ii < nn; ii++) {
			String kk = vk.next();
			st[ii] = kk;
		}
		for (int i1 = 0; i1 < nn; i1++) {
			map.put(i1, st[i1]);
		}
		sv[0] =map.get(0);
		sv[1] =map.get(1);
		int count = 1;
			cc = (char[]) sv[0].toCharArray();
			for (int i2 = 0; i2 < cc.length; i2++) {
				for (int int1 = 0; int1 < cc.length; int1++) {
					if (i2 == int1) {
						continue;
					}
					else {
						if(cc[i2]!=cc[int1]) {
							st1.push(count);
							count++;
						}
						else if(cc[i2]==cc[int1]) {
							st1.push(count);
						}
					}

				}
			
		}
			int count2 = 1;
			cc = (char[]) sv[1].toCharArray();
			for (int i2 = 0; i2 < cc.length; i2++) {
				for (int int1 = 0; int1 < cc.length; int1++) {
					if (i2 == int1) {
						continue;
					}
					else {
						if(cc[i2]!=cc[int1]) {
							st2.push(count2);
							count2++;
						}
						else if(cc[i2]==cc[int1]) {
							st2.push(count2);
						}
					}

				}
			
		}
			System.out.println(st1);
			System.out.println(st2);
		if(st1.equals(st2)) {
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
}
