import java.util.Scanner;
import java.util.Stack;

public class Brackets {
	public static void main(String[] args) {
		Stack f = new Stack();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int c=0;
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int m = n.length();
		for (int i = 0; i < m; i++) {
			f.push(n.charAt(i));
		}
		for (int i = 0; i < m; i++) {
			if (f.get(i).equals('(')) {
				count1++;
				if(count1>count2) {
					c++;
					System.out.println("False");
					break;
				}
			}
			else if (f.get(i).equals(')')) {
				count2++;
				
			}
			else if (f.get(i).equals('[')) {
				count3++;
				if(count3>count4) {
					c++;
					System.out.println("False");
					break;
			}
			else if (f.get(i).equals(']')) {
				count4++;
				
				}
			} 
			else if (f.get(i).equals('}')) {
				count5++;
				if(count5>count6) {
					c++;
					System.out.println("False");
					break;
				}
			} 
			else if (f.get(i).equals('{')) {
				count6++;
				
			}
			
		}
if(c==0) {
		if (count1 == count2 & count3 == count4 & count5 == count6)
			System.out.println("True");
		else
			System.out.println("False");
	}
	}
}
