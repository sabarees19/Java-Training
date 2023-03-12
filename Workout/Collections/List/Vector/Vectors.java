import java.util.*;
class Vectors{
    public static void main(String args[]){ 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = s.nextInt();
        Vector vin = new Vector();
            for(int i=0;i<=n;i++){
            System.out.print("Enter Input : ");
            vin.addElement(s.next());
            }
            System.out.print(vin);
    }
}
