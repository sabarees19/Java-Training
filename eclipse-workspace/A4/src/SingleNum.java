import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;

public class SingleNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = s.nextInt();
		Integer[] st = new Integer[n];
		Stack st1 = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			Integer k = s.nextInt();
			st[i] = k;
		}
		for (int i = 0; i < n; i++) {
			map.put(i, st[i]);
		}
//		for (Map.Entry m : map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		for (int i = 0; i < st.length; i++) {
		for (Map.Entry m : map.entrySet()) {
			int count = n;
			
			for (Map.Entry mm : map.entrySet()) {
//			for (int j = 0; j < st.length; j++) {
				if (m.getValue() == mm.getValue()) {
					continue;
				} 
				else {
					count -= 1;
				}
			}
			if (count == 1) {
				st1.push(m.getValue());
			}
		}

		System.out.println(st1);
	}
}
