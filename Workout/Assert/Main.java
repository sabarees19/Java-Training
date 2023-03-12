import java.util.*;
//class Main
//{
//	public static void main(String[] args) {
//        int x=10;
//        assert(x>10):"here  >10";
//		System.out.println(x);
//	}
//}
//{
//    public static void main(String[] args){
//        int x=10;
//        assert(x>10):methodOne();
//        System.out.println(x);
//    }
//    public static int methodOne(){
//        return 999;
//    }
//}
//
enum Beer
{
KF,KO,RC,FO;
}
class Main{
public static void main(String
args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        Beer[] b1 = Beer.values();
        Beer w = b1[n];
        switch(w){
            case KF:
            System.out.println("it is childrens brand");
            break;
            case KO:
            System.out.println("it is too lite"); break;
            case RC:
            System.out.println("it is too hot"); break;
            case FO:
            System.out.println("buy one get one"); break;
            default:
            System.out.println("other brands are not good");
        }
    }
}
