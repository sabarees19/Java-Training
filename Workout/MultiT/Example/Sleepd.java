class One extends Thread{
    public void run(){
        for(int i =1;i<=10;i++){
            try{
                Thread.sleep(5000);
            }
            catch(Exception  e){
                System.out.println("Delayed"); 
            }
            System.out.println("one "+i);
        }
    }
}
class Two extends Thread{
    public void run(){
    for(int i =1;i<=10;i++)
            System.out.println("two "+i); 
    }
}
class Three extends Thread{
    public void run(){
    for(int i =1;i<=10;i++)
            System.out.println("three "+i); 
    }
}
class Sleepd{
    public static void main(String[] args){
        One o = new One();
        Two t = new Two();
        Three te = new Three();
        o.start();
        t.start();
        te.start();
    }
}
