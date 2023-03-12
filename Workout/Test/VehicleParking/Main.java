import java.util.*;
class Main{
    public static void main(String args[]){
    int N1,N2,N3,N4,N;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter N1 : ");
    N1 = s.nextInt();
    System.out.print("Enter N2 : ");
    N2 = s.nextInt();
    System.out.print("Enter N3 : ");
    N3 = s.nextInt();
    System.out.print("Enter N4 : ");
    N4 = s.nextInt();
    System.out.print("Enter N : ");
    N = s.nextInt();
    int Rn  = N1+N2+N3+N4;
//    System.out.println(Rn);
    N1 = N1;
    N2 = N1+N2;
    N3 = N2+N3;
    N4 = N3+N4;
//    System.out.println(N1);
//    System.out.println(N2);
//    System.out.println(N3);
//    System.out.println(N4);
    int R = Rn-N;
//    System.out.println(R);
        if(N1>=N){
              System.out.println("B1");
        }
        else if(N2>=N){
              System.out.println("B2");
        }
        else if(N3>=N){
              System.out.println("B3");
        }
        else if(N4>N){
              System.out.println("B4");
        }
        else{ 
            System.out.println("Exit");
        }
    }
}

