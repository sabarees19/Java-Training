import java.lang.*;
public class Priority
{
	public static void main(String[] args) {
	    Thread t = Thread.currentThread();
	    t.setName("Sigma");
		System.out.println("Thread Name : "+t.getName());
		System.out.println("Thread Priority : "+t.getPriority());
		ThreadGroup tg = t.getThreadGroup();
		System.out.println("Thread Group : "+tg.getName());
		System.out.println("Is alive : "+t.isAlive());
		System.out.println("To String : "+t.toString());
		t.setPriority(10);
		System.out.println("Thread Priority : "+t.getPriority());
	}
}

