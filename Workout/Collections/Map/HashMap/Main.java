import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashMap h = new HashMap();
	    h.put(82,"sabarees");
	    h.put(90,"nathan");
	    h.put(87,"sarath");
	    h.put(89,"sasi");
	    System.out.println(h);
	    h.put(90,"senthil");
	    HashMap h1 = new HashMap();
	    h1.putAll(h);
        System.out.println(h1);
        System.out.println(h1.get(82));
        System.out.println(h1.entrySet());
        System.out.println(h1.keySet());
        System.out.println(h1.values());
        System.out.println(h);
        Set ms = h.entrySet();
        Iterator itr = ms.iterator();
        while(itr.hasNext()){
            Map.Entry temp=(Map.Entry)itr.next(); //note
            int tempKey = (Integer)temp.getKey();
            String tempValue = (String)temp.getValue();
            if (tempKey==89 | tempKey==82 | tempKey==90)
                continue;
            else    
                System.out.println(temp+" waste");
        }
	}
}

