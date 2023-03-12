//import java.util.*;
//
//class Main{
//    public static void main(String args[]){
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter Str : ");
//        String str = s.next();
//        String a = "c++";
//        String b = "C++";
//        String c = "Java";
//        
//        try{
//            if (str.equals(c)){
//                System.out.println("No Exception.");
//                System.out.println("String val is Java.");
//            }      
//        }
//        catch(Exception e){
//            System.out.println("Inside catch block.");
//            if(str.equals(a)){
//                System.out.println("String val is c++.");
//            }
//            else if(str.equals(b)){
//                System.out.println("String val is C++.");
//            }            
//        } 
//    }
//}
import java.util.*;


class Abinesh extends Exception {
  public Abinesh(String txt) {
    super(txt);
  }
}


class ExceptionExercise {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string : ");
    String str = sc.next();
    try{
      if(str.equals("C++"))
      {
        throw new Abinesh("I hate C++");
      }
      else if(str.equals("c++")){
          throw new Abinesh("I hate c++");
      }
      else {
          System.out.println("No Exception");
          System.out.println("String val is " + str);
      }
    }
    catch(Exception e) {
      System.out.println("Inside catch block. ");
      if(str.equals("C++"))
      {
        System.out.println("String val is C++");
      }
      else if(str.equals("c++")){
          System.out.println("String val is c++");
      }
      
    }
    
  }
}
