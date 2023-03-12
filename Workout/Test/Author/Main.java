import java.util.*;
class Author implements Comparable{
    private String name;
    private String email;
    private String gender;
    Author(String name,String email,String gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    String getGender(){
        return gender;
    }
}
class AuthorBO{
    public void displayAllAuthorDetails(List list){
        System.out.println(list);
    }
    public void listAuthorNamesInSortedOrder(List authorList){
        for(int i=0;i<authorList.size();i++){
            System.out.println(authorList.get(i));
        }
    }
    public void findAuthorByName(List authorList, String name){
        int s =authorList.indexOf(name);
        System.out.println("Details of the Item :");
        System.out.print(authorList.get(s)+" ");
        System.out.print(authorList.get(s+1)+" ");
        System.out.print(authorList.get(s+2)+" ");
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
                do{
                System.out.println("Do you want to add the details of another author? Type Yes/No (Not case sensitive)");
                String option = sc.next();
                switch(option){
                case "yes":
                    System.out.println("Enter the author name");
                    String iname = sc.next();
                    System.out.println("Enter the author email id");
                    String iemail = sc.next();  
                    System.out.println("Enter the author's gender");
                    String igender = sc.next();
                    Author ar = new Author(iname,iemail,igender);
                    list.add(ar.getName());
                    list.add(ar.getEmail());
                    list.add(ar.getGender());
                    list1.add(ar.getName());
                    
                    break;
                case "no":
                    AuthorBO a = new AuthorBO();
                    a.displayAllAuthorDetails(list);
                    System.out.println("Enter the search name");
                    String sname = sc.next();
                    a.findAuthorByName(list,sname);
                    Collections.sort(list1);
                    a.listAuthorNamesInSortedOrder(list1);
                    System.exit(0);
                    break; 
                }
                }while(true);        
    }
}
