import java.util.Scanner;

public class StringBul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		float ss = sc.nextFloat();
		int offset = sc.nextInt();
		StringBuilder b = new StringBuilder(str);
		try {
			b.insert(offset, ss);
		} catch (Exception e) {
			System.out.println("Wrong Input Dude");
		} finally {
			System.out.println(b);
		}
		int s = sc.nextInt();
		int en = sc.nextInt();
		try {
			b.replace(s, en, str);
		} catch (Exception e) {
			System.out.println("Wrong Input Length Dude");
		} finally {
			System.out.println(b);
		}
		int s1 = sc.nextInt();
		int en1 = sc.nextInt();
		try {
			b.delete(s1, en1);
		} catch (Exception e) {
			System.out.println("Wrong Input Length Dude");
		} finally {
			System.out.println(b);
		}
		try {
			int num = sc.nextInt();
			b.append(num);
		} catch (Exception e) {
			System.out.println("Wrong Input Length Dude");
		} finally {
			System.out.println(b);
		}
		try {
			int nu = sc.nextInt();
			System.out.println(b.charAt(nu));
		} catch (Exception e) {
			System.out.println("Wrong Input Length Dude");
		} finally {
			System.out.println(b);
		}
	}

}
