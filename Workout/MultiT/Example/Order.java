class Para{
    synchronized public void disp(String s){
        System.out.print("["+s);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(" ");
        }
        System.out.print("]");
    }
}
class Eight extends Thread{
    Para p;
    String s;
    Eight(Para p,String s){
    this.p=p;
    this.s=s;
    }
    public void run(){
        p.disp(s);
    }
}
class Order{
    public static void main(String args[]){
        Para p = new Para();
        new Thread(new Eight(p,"one")).start();
        new Thread(new Eight(p,"two")).start();
    }
}

//import java.lang.*;
//class Paranthesis{
//    synchronized public void disp(int S){
//        System.out.print("["+S);
//        try{
//             Thread.sleep(1000);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        System.out.println("]");
//    }
//}
//class Eight implements Runnable{
//    Paranthesis p;
//    int S;
//    Eight(Paranthesis p,int S){
//        this.p =p;
//        this.S =S;
//    }
//    
//    public void run(){
//        p.disp(S);
//    }
//}
//class Main{
//    public static void main(String[] args){
//        Paranthesis p = new Paranthesis();
//        for(int i=1;i<=1000;i+=50)
//        new Thread(new Eight(p,i)).start();
//
//    }
//}
