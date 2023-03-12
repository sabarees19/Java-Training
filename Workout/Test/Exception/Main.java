import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Str : ");
        String str = s.next();
        try{
            if (str.equalsIgnoreCase("c++")){

                  throw new Exception();
            }      
            else{
                System.out.println("No Exception.");
                System.out.println("String val is "+str);
            }
        }
        catch(Exception e){
            System.out.println("Inside catch block.");
            if(str.equalsIgnoreCase("c++")){
                System.out.println("String val is "+str);
            }
                       
        } 
    }
}

