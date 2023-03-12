import java.util.*;
class Inter2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size 1: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr1[i]=k;
        }
        System.out.print("Enter the Size 2: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++){
            int k = sc.nextInt();
            arr2[i]=k;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr1[i]){
                    if(arr1[i]==arr2[j])
                        System.out.print(arr1[i]+" ");
                        arr2[j]=-1;
                }
            }
        }
    }
}
        
