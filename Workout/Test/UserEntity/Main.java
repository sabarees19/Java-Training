class User{
    String name;
    String mobileNumber;
    String email;
    String address;   
}
import java.util.Scanner;
import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		Stack f = new Stack();
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int m = n.length();
		for (int i = 0; i < m; i++) {
			f.push(n.charAt(i));
		}
		if (f.get(0).equals(f.get(m - 1))) {
		
		} 
		else {
			for (int i = 1; i < m-3 ; i+=2) {
				m= i*21;
				if (f.get(m).equals("[") ||f.get(m).equals("{") ||f.get(m).equals("]")) {
					System.out.println("True");
				} 
				else
					System.out.println("False");
			}
		}
	}

}

