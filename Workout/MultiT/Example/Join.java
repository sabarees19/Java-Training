class Sv extends Thread{
    public void run(){
            System.out.println("i");        
    }
}
class Join{
    public static void main(String args[]){
        Sv s = new Sv();
        s.start();
        try{
            s.join();
        }
        catch(Exception e){
            System.out.println("v");
        }
            System.out.println("v");    
    }
}
