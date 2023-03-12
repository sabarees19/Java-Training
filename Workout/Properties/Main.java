import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[])throws Exception{
        String filename = "sen.prop";
        FileReader fr = new FileReader(filename);
        
        Properties p = new Properties();
        p.load(fr);
        String user = p.getProperty("User");
        String id = p.getProperty("Id");
        
        System.out.println("User"+user);
        System.out.println("Id"+id);        
    }
}
