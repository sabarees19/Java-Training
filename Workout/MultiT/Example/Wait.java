class ThreadB extends Thread{
    int total=0;
    public void run(){
        synchronized(this){
            System.out.println("ThreadB starts..");
            for (int i=1;i<=10;i++){
                total+=1;
            } 
            System.out.println("Thread giving noyification");
            this.notify();
        }
    }
}
class Wait{
    public static void main(String args[])throws InterruptedException{
        ThreadB obj = new ThreadB();
        obj.start();
        synchronized(obj){
            System.out.println("ThreadA starts..");
            System.out.println("main calls wait() method");
            obj.wait();
            System.out.println("Total : "+obj.total);
        }
    }
}
