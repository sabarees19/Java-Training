class Trd extends Thread{
    public void run(){
        for(int i =1;i<=10;i++){
            System.out.println(i+"sen"); 
        }
    }
}
public class Main{
	public static void main(String[] args) {
		Trd tr = new Trd();
		tr.start();
		
		    for(int i =1;i<=10;i++)
            System.out.println(i+"thil");
	}
}
