import java.io.*;
class Food implements Serializable{
    int i = 9;
    transient int j = 4;
}
class SerDemo{
    public static void main(String args[])throws Exception{
        Food f1 = new Food();
        FileOutputStream fo = new FileOutputStream("my.txt");
        ObjectOutputStream os = new ObjectOutputStream(fo);
        os.writeObject(f1);

        FileInputStream fi = new FileInputStream("my.txt");
        ObjectInputStream is = new ObjectInputStream(fi);
        Food f2 = (Food)is.readObject();
        System.out.println(f2.i+"\t"+f2.j);
    }
}
