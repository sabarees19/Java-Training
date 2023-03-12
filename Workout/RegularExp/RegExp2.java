import java.util.regex.*;
import java.util.Scanner;
public class RegExp2{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
	String k = s.next();
    Pattern p = Pattern.compile("a+");
    Matcher m = p.matcher(k);
    while(m.find()){
        System.out.println(m.start()+"    "+m.group());
    }
    System.out.println("No");
}
}
