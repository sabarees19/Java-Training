import java.util.*;
class Item{
    private String name;
    private double cost;
    private static int count;
    Item(String name,double cost){
        this.name=name;
        this.cost=cost;
        count++;
    }
    String getName(){
        return name;
    }
    double getCost(){
        return cost;
    }
    Item(){}
    int getCount(){
        return count;
    }
    void displayDetails(){
        System.out.print("name : "+getName());
        System.out.print("cost : "+getCost());
    }
}
class Fruit extends Item{
    private static int count;
    Fruit(){}
    Fruit(String name,double cost){
        super(name,cost);
        count++;
    }
    int count(){
        return count;
    }
}
class Vegetables extends Item{
    private static int count;
    Vegetables(String name,double cost){
        super(name,cost);
        count++;
    }
    Vegetables(){}
    int count(){
        return count;
    }
}
class ItemBO{
    void searchByCost(ArrayList itemList,double cost){
        ArrayList bin = itemList;
        int p =bin.indexOf(cost);
        System.out.println("Details of the Item :");
        System.out.println("Name : "+bin.get(p-1));
        System.out.println("Cost : "+bin.get(p));
    }
    void searchByName(ArrayList itemList,String name){
        ArrayList bin1 = itemList;
        int s =bin1.indexOf(name);
        System.out.println("Details of the Item :");
        System.out.println("Name : "+bin1.get(s));
        System.out.println("Cost : "+bin1.get(s+1));
    }
}
class Main{
    public static void main(String args[]){
         Scanner s = new Scanner(System.in);
         ArrayList arrayList = new ArrayList();
        do{    
        System.out.println("1.Add a Fruit\n2.Add a Vegetable\n3.Display\n4.Search\n5.Exit");
        System.out.println("Enter The Choice : ");
        int choice = s.nextInt();
            switch(choice){
                    case 1:
                        System.out.println("Fruits");
                        System.out.println("Enter The Name : ");
                        String nameinput = s.next();
                        System.out.println("Enter The Cost : ");
                        double costinput = s.nextDouble();
                        Fruit fruit = new Fruit(nameinput,costinput);    
                        arrayList.add(fruit.getName());
                        arrayList.add(fruit.getCost());
                        break;
                    case 2:
                        System.out.println("Vegetables");
                        System.out.println("Enter The Name : ");
                        String nameinput1 = s.next();
                        System.out.println("Enter The Cost : ");
                        double costinput1 = s.nextDouble();
                        Vegetables vegetables = new Vegetables(nameinput1,costinput1);
                        arrayList.add(vegetables.getName());
                        arrayList.add(vegetables.getCost());
                        break;
                    case 3:
                        System.out.println(arrayList);
                        break;
                    case 4:
                        System.out.println("1.Cost / 2.Name");
                        System.out.print("Select Option : ");
                        int option = s.nextInt();
                        if(option==1){
                            System.out.println("Enter The Cost : ");
                            double costinput2 = s.nextDouble();
                            ItemBO itemBo = new ItemBO();
                            itemBo.searchByCost(arrayList,costinput2);
                        }    
                        else if(option==2){
                            System.out.println("Enter The Name : ");
                            String Nameinput2 = s.next();
                            ItemBO itemBo = new ItemBO();
                            itemBo.searchByName(arrayList,Nameinput2);
                        }                         
                        break;
                    case 5:
                        Fruit f = new Fruit();
                        System.out.println("Total Fruits : "+f.count());
                        Vegetables v = new Vegetables();
                        System.out.println("Total Vegetables : "+v.count());
                        Item i = new Item();   
                        System.out.println("Total Item : "+i.getCount());             
                        System.exit(0);
                        break;
            }

        }while(true);
    }
}
