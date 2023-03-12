import java.util.*;
interface MaintainanceCharge{
    computeMaintainanceCharge();
}
class Account{
    String name;
    int number;
    int balance;
    String date;
    Account(String name,int number,int balance,String date){
    this.name=name;
    this.number=number;
    this.balance=balance;
    this.date=date;
    }
}
class CurrentAccount extends Account implements
MaintainanceCharge{
    super.computeMaintainanceCharge(){
        System.out.println(""+)
    }
}
