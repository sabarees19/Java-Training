import java.util.*;
class Star{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                    System.out.print(j+1);
                }
                for(int j=1;j<i;j++){
                    System.out.print("**");
                }
                for(int j=n-i;j>=0;j--){ 
                    System.out.print(j+1);                        
                }
                System.out.println();	    
        }
    }
}
