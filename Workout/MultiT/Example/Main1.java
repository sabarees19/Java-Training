class MyRunnable implements Runnable{
    public void run(){
        for(int i =1;i<=10;i++)
            System.out.println("sen"+i); 
    }
}
class Main1{
    public static void main(String[] args){
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
            for(int i =1;i<=10;i++)
            System.out.println(i+"thil"); 
    }
}
