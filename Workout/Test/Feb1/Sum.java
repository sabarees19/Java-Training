import java.util.*;
class Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int s=0;
            for(int j=1;j<=i;j++){
                    System.out.print(j);
                    s+=j;
                    if(j!=i)
                    {
                        System.out.print("+");
                    }
            }
            System.out.print("="+s);
            System.out.println();    
        }
    }
}
