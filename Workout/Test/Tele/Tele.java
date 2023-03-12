import java.util.*;
class Tele{
        public static void main(String args[]){
           Scanner s = new Scanner(System.in);
           System.out.print("Enter the Telephone Bill Number :");
           int BillNum = s.nextInt();
           System.out.print("Enter the Customer Name :");
           String CosName = s.next();
           System.out.print("Enter the Number of Calls made :");
           int CallsMade = s.nextInt();
           System.out.print("Enter the Cost per Call :");
           float  Costpercall = s.nextFloat();
           System.out.println("Bill Number :"+BillNum);
           System.out.println("Customer Name :"+CosName);
           float Tbill= CallsMade*Costpercall;
           System.out.println("Telephone Bill Amount :"+Tbill);
           System.out.print("Enter the Current Bill Number :");
           int CurBillNum = s.nextInt();
           System.out.print("Enter the Customer Name :");
           String CusName = s.next();
           System.out.print("Enter the Number of Units Consumed :");
           int units = s.nextInt();
           System.out.print("Enter the Cost per Unit :");
           float Costunit = s.nextFloat();
           System.out.println("Bill Number :"+CurBillNum);
           System.out.println("Customer Name :"+CusName);
           float Cbill= units*Costunit;
           System.out.println("Current Bill Amount :"+Cbill);
           }
}


//import java.util.*;
//class Bill{
//    private int billNumber;
//    private String name;
//    public Bill(int id,String name){
//        billNumber=id;
//        this.name=name;
//    }
//    public int generateBillNumber(){
//        return billNumber;
//    }
//    public String generateBillName(){
//        
//        return name;
//    }
//    public double generateBill(){
//        return 0.0;
//    }
//    
//} 
//class TelephoneBill extends Bill{
//    private int numberOfCallsMade;
//    private double costPerCall;
//    public TelephoneBill(int tid,String tname,int numberOfCallsMade,double costPerCall){
//        super(tid,tname);
//        this.numberOfCallsMade=numberOfCallsMade;
//        this.costPerCall=costPerCall;
//        
//    }
//    public double generateBill(){
//        super.generateBillNumber();
//        super.generateBillName();
//        double x = numberOfCallsMade*costPerCall;
//        return x;
//    }
//}
//class CurrentBill extends Bill{
//    private int numberOfUnitsConsumed;
//    private double costPerUnit;
//    public CurrentBill(int cid,String cname,int numberOfUnitsConsumed,double costPerUnit){
//        super(cid,cname);
//        this.numberOfUnitsConsumed=numberOfUnitsConsumed;
//        this.costPerUnit=costPerUnit;
//        
//    }
//    public double generateBill(){
//        super.generateBillNumber();
//        super.generateBillName();
//        double y = numberOfUnitsConsumed*costPerUnit;
//        return y;
//    }
//}
//class Oops1{
//    public static void main(String []args){
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the Telephone Bill Number :");
//        int tbillNumber=s.nextInt();
//        System.out.println("Enter the Customer Name :");
//        String tname=s.next();
//        System.out.println("Enter the Number of Calls made :");
//        int numberOfCallsMade=s.nextInt();
//        System.out.println("Enter the Cost per Call :");
//        double costPerCall=s.nextDouble();
//        System.out.println("Enter the Current Bill Number :");
//        int cbillNumber=s.nextInt();
//        System.out.println("Enter the Customer Name :");
//        String cname=s.next();
//        System.out.println("Enter the Number of Units Consumed :");
//        int numberOfUnitsConsumed=s.nextInt();
//        System.out.println("Enter the Cost per Unit :");
//        double costPerUnit=s.nextDouble();
//        Bill b ;
//        b= new TelephoneBill(tbillNumber,tname,numberOfUnitsConsumed,costPerUnit);
//        
//        double m = b.generateBill();
//        System.out.println("telephone bill="+m);
//      
//        b = new CurrentBill(cbillNumber,cname,numberOfUnitsConsumed,costPerUnit);
//        
//        double n = b.generateBill();
//        System.out.println("current bill="+n);
//        
//    }
//}



