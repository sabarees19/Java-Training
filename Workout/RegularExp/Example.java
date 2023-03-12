import java.util.regex.*;
import java.util.Scanner;
public class Example
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String k = s.next();
	    int count=0;
	    Pattern p = Pattern.compile("ece");
	    Matcher m = p.matcher(k);
	    while(m.find()){
	        count++;
	        System.out.println(m.start()+"    "+m.end()+"    "+m.group());
	    }
}}
