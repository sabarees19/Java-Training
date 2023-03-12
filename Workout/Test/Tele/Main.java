import java.util.*;
class Bill{
        private int billNumber;
        private String name;
        Bill (int billNumber,String name){
            this.billNumber=billNumber;         
            this.name=name;
        }
        void generateBill(){
            System.out.println("bill number"+billNumber);
            System.out.println("customer name"+name);
        }
}
class TelePhoneBill extends Bill{
        private int numberOfCallsMade;
        private double costPerCall;
        TelePhoneBill(int billNumber,String name,int numberOfCallsMade,double costPerCall){
               super(billNumber,name);
               this.numberOfCallsMade=numberOfCallsMade;         
               this.costPerCall=costPerCall;        
        }
        void generateBill(){
            super.generateBill();
            System.out.println("TelePhoneBill"+(numberOfCallsMade*costPerCall));
        }
}
class CurrentBill extends Bill{
        private int numberOfUnitsConsumed;
        private double costPerUnit;
        CurrentBill(int billNumber,String name,int numberOfUnitsConsumed,double costPerUnit){
              super(billNumber,name);
              this.numberOfUnitsConsumed=numberOfUnitsConsumed;         
              this.costPerUnit=costPerUnit;          
        }
        void generateBill(){
            super.generateBill();
            System.out.println("CurrentBill"+(numberOfUnitsConsumed*costPerUnit));
        }
}
class Main{
        public static void main(String args[]){
           Scanner s = new Scanner(System.in);
           System.out.print("Enter the Telephone Bill Number :");
           int BillNum = s.nextInt();
           System.out.print("Enter the Customer Name :");
           String CosName = s.next();
           System.out.print("Enter the Number of Calls made :");
           int CallsMade = s.nextInt();
           System.out.print("Enter the Cost per Call :");
           double  Costpercall = s.nextFloat();
           
           System.out.print("Enter the Current Bill Number :");
           int CurBillNum = s.nextInt();
           System.out.print("Enter the Customer Name :");
           String CusName = s.next();
           System.out.print("Enter the Number of Units Consumed :");
           int units = s.nextInt();
           System.out.print("Enter the Cost per Unit :");
           double Costunit = s.nextFloat();
           Bill b;
           b= new TelePhoneBill(BillNum,CosName,CallsMade,Costpercall);
           b.generateBill();
           
           b= new CurrentBill(CurBillNum,CusName,units,Costunit);
           b.generateBill();
           }
}
