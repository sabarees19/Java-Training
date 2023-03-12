import java.util.*;
class Counter{
    private double price;
    private int count;
    Counter(double price,int count){
        this.price=price;
        this.count=count;
    }
    Counter(){}
    public double getPrice(){
        return price;
    }
    public int getCount(){
        return count;
    }
}
class Details{
    String name;
    String gender;
    int age;
    Details(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    
}
class AmountCalc{
      double p16=0.0,pf=0.0,pf64=0.0,p64=0.0,pe=0.0;
      static double ta=0.0;
//    AmountCalc(String cgender,int cage){
//        calgender=cgender;
//        calage=cage;
//    }
    void result(double pp,String cgender,int cage,int count){
        double pr = pp;
        int ik=1;
        while(ik<=count){
            if(cage<=15){
                p16 = pr*0.5;
                break;
            }
            else if(cgender.equals("f") && cage>=16 && cage<=64){
                pf = pr-(pr*0.1);
                break;   
            }
            else if(cage>64){
                p64 = pr-(pr*0.25);
                break;   
            }
            else{
                pe = pr;
                     
            }
            ik++;
        }
        ta =ta+ p16+pf+p64+pe;
        System.out.println(ta);
        
    }  
    double ret(){
         return this.ta; 
    } 
}
class Main{
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price : ");
        double iprice = sc.nextInt();
        System.out.println("Enter count : ");
        int icount = sc.nextInt();
        Counter c = new Counter();
        Details d;
        AmountCalc ac =new AmountCalc();
            for(int i=1;i<=icount;i++){
                System.out.println("Enter Details for Person "+i+" :");
                System.out.println("Enter name : ");
                String iname = sc.next();
                System.out.println("Enter gender : ");
                String igender = sc.next();
                System.out.println("Enter age : ");
                int iage = sc.nextInt();
                c = new Counter(iprice,icount);
                d = new Details(iname,igender,iage);
                ac.result(iprice,igender,iage,icount);
            }   
        System.out.println("Ticket Details are :");
        System.out.println("Number of Passengers : "+c.getCount());
        System.out.println("Price of a ticket : "+c.getPrice());
        System.out.println("Total Amount : "+ac.ret());
    }
}
