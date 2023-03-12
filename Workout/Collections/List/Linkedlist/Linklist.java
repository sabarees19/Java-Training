import java.util.*;
class Linklist{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        ystem.out.print("Enter size : ");
        int n = s.nextInt();
        LinkedList arr = new LinkedList();
        for(int i=0;i<=n;i++){
            arr.add(i);
        }
            System.out.println(arr);
            arr.add(1);
            System.out.println(arr);
            arr.add(1,"mm");
            System.out.println(arr);
            arr.remove(2);
            System.out.println(arr);
            arr.addFirst("n");
            System.out.println(arr);
            arr.set(6,"oo");
            System.out.println(arr);
            arr.getFirst();
    }
}
