import java.util.*;
import java.lang.*;
class Item{
    private String name;
    private double cost;
    private int count;
    Item(String name,int cost){
            this.name=name;
            this.cost=cost;
            count++;
       }
     public int costjk(){
        return cost;
}
      
         
}   
class Fruit extends Item{
        Fruit(String fname,int fcost,int fcount){
        super.inputname(fname,fcost,fcount);
//        String icost = String.valueOf(fcost);
//        String[] na = new String[10];
//              na[0]=fname;
//              na[1]=icost;
//        for (int i=0;i<2;i++){
//        if (i%2==0){
//        System.out.println("The Fruit Name : "+na[i]);
//        }
//        else{
//        System.out.println("Cost of Fruit : "+na[i]);
//        }
        
        }        
}
//class Veg extends Item{
//        Veg(String vname,int vcost){
//        super.inputname(vname,vcost) ;
//        }        
//        String jcost = String.valueOf(vcost);
//        
//        String[] na = new String[10];
//              na[0]=vname;
//              na[1]=jcost;
//        for (int i=0;i<2;i++){
//        if (i%2==0){
//        System.out.println("The Fruit Name : "+na[i]);
//        }
//        else{
//        System.out.println("Cost of Fruit : "+na[i]);
//        
//        }       
//                
//}
class search extends Item{
        Scanner sc = new Scanner(System.in);

}
class Main{
        public static void main(String args[]){
        System.out.println("1.Add a Fruit\n2.Add a Vegetable\n3.Exit\n");
        Scanner s = new Scanner(System.in);
        System.out.print("Select option: ");
        int option = s.nextInt();
            if (option==1){
            System.out.println("\nFruits");
            System.out.println("\nenter the name: ");
            String cname = s.next();
            System.out.println("\nenter the cost: ");
            int ccost = s.nextInt();
            System.out.println("\nenter the count: ");
            int ccount = s.nextInt();
            Item f = new Fruit(cname,ccost,ccount);
            }
            else if (option==2){
            System.out.println("\nVegetables");
            System.out.println("\nenter the name: ");
            String nname = s.next();
            System.out.println("\nenter the cost: ");
            int ncost = s.nextInt();
            Item v = new Veg(nname,ncost);
            }
            else if (option==3){
            System.out.print("Exit");
            }
          
        }
}

//        void show(){
//             
//    }
//
//        System.out.println("\nenter the name: ");
//        String inputname = s.next();
//        System.out.println("\nenter the cost: ");
//        double inputcost = s.nextDouble();   
//        
//            //        Item item = new Item();
//        item.show();
        
