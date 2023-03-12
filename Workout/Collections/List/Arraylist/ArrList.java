import java.util.*;
class ArrList{
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter size : ");
    int n = s.nextInt();
    ArrayList arr = new ArrayList();
        for (int i=0;i<=n;i++){
            arr.add(i);
        }
        arr.add(2,"m");
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        arr.add("m");
        System.out.println(arr);
        arr.set(0,"zero");
        System.out.println(arr);
    }
}
