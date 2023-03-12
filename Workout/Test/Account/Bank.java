import java.util.*;
class Account{
        void show(){
           Scanner s = new Scanner(System.in);
           System.out.print("Bank Name");
           String BankName = s.next();
           System.out.print("Account Number");
           int AccNum = s.nextInt();
           System.out.print("Account Balance");
           int AccBal = s.nextInt();
           System.out.print("Enter the Start Date(yyyy-mm-dd)");
           String StartDate = s.next();
           System.out.print("Enter the Years");
           int Years = s.nextInt();
           int MaintanaceAmount = ((100*Years)+200);
           System.out.print("MaintanaceAmount"+MaintanaceAmount);
           }
           void shows(){
                Scanner s = new Scanner(System.in);
           System.out.print("Bank Name");
           String BankName = s.next();
           System.out.print(BankName);
           System.out.print("Account Number");
           int AccNum = s.nextInt();
           System.out.print("Account Balance");
           int AccBal = s.nextInt();
           System.out.print("Enter the Start Date(yyyy-mm-dd)");
           String StartDate = s.next();
           System.out.print("Enter the Years");
           int Years = s.nextInt();
           int MaintanaceAmount1 = ((2*50*Years)+50);
           System.out.print("MaintanaceAmount"+MaintanaceAmount1);
            }
}
class CurrentAccount{
       void curacc(){
       Account account = new Account();
       account.show();
       }
}
class SavingsAccount{
        void savacc(){
            System.out.print("SavingsAccount");
            Account account = new Account();
            account.shows();
        }
        
}
class Bank{
    public static void main(String args[]){
    Scanner o = new Scanner(System.in);
    System.out.print("Select option");
    int option = o.nextInt(); 
    if (option==1){
    CurrentAccount currentaccount = new CurrentAccount();
    currentaccount.curacc();
    }
    else if (option==2){
    SavingsAccount savingsaccount = new SavingsAccount();
    savingsaccount.savacc();
    }
}
        
}
