import java.util.*;
class Vcount{
    public static void main(String args[]){ 
        HashMap hm = new HashMap();
        hm.put("a",0);
        hm.put("e",0);
        hm.put("i",0);
        hm.put("o",0);
        hm.put("u",0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Counters : ");
        int count = sc.nextInt();
            for(int i=1;i<=count;i++){
                System.out.println("Enter text for counter "+i+" : ");
                String text = sc.next();
            }
    }
}

