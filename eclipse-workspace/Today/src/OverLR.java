import java.util.Scanner;

class OverLoad{
	int id;
	String name,clgn;
	OverLoad(){
		System.out.println("Empty Method");
	}
	OverLoad(String name,int id){
		this.name=name;
		this.id=id;
	}
	OverLoad(String name,int id,String clgn){
		this(name,id);
		this.clgn=clgn;
	}
	String getname() {
		return name;
	}
	int getid() {
		return id;
	}
	String getclgn() {
		return clgn;
	}
	void org() {
		
	}
}
class OverRide extends OverLoad{
	OverRide(String name,int id,String clgn){
		super(name,id,clgn);
	}
	void org() {
		System.out.println("OverRide");
		System.out.println("Name : "+getname()+", Id : "+getid()+" , Clg : "+getclgn());
	}
}
public class OverLR {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int Iid = sc.nextInt();
		System.out.println("Enter Name");
		String Iname = sc.next();
		System.out.println("Enter CLgName");
		String Iclg = sc.next();
		OverLoad ol = new OverLoad();
		OverLoad ol1 = new OverLoad(Iname,Iid);
		System.out.println("2 arguments Method");
		System.out.println("Name : "+ol1.getname()+", Id : "+ol1.getid());
		OverLoad ol2 = new OverLoad(Iname,Iid,Iclg);
		System.out.println("3 arguments Method");
		System.out.println("Name : "+ol2.getname()+", Id : "+ol2.getid()+" , Clg : "+ol2.getclgn());
		OverRide or = new OverRide(Iname,Iid,Iclg);
		or.org();
	}

}
