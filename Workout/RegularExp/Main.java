import java.util.*;
import java.util.regex.*;
class Java
{
    void meth(){
	    Scanner s = new Scanner(System.in);
	    String k = s.nextLine();
	    int index = 0;
	    StringTokenizer sp = new StringTokenizer(k);
	    while(sp.hasMoreTokens()){
	        index++;
	        System.out.println(index+"  "+ sp.nextToken());
	    }
        System.out.println(k.split(" ").length);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String k = s.nextLine();
	    Pattern p = Pattern.compile("\\.");
	    String[] sp = p.split(k);
	    for(String s1:sp){
	        System.out.print(s1+" ");
	    }
        System.out.println(" ");
        Java j = new Java();
        j.meth();
	}
}
