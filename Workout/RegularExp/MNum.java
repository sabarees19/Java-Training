import java.util.regex.*;
import java.util.Scanner;
public class MNum{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 10 Digit Number : ");
	    String k = s.next();
        Pattern p = Pattern.compile("[9]?[1]?[+]?[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
        Matcher m = p.matcher(k);
        if(m.find()&& m.group().equals(k)){
            System.out.println("Valid Number : "+m.group());
        }
        else
        System.out.println("Invalid Number : "+k);
    }
}
