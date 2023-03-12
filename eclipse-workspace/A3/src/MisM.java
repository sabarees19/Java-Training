import java.util.*;
public class MisM {
	private static int indexOf(Set<Integer> set, Integer element){
       
        int index = -1;
        
        Iterator<Integer> itr = set.iterator();
        
        Integer currentElement = null;
        int currentIndex = 1;
        
        while(itr.hasNext()){
            
            currentElement = itr.next();
            
            if(currentElement.equals(element)){
                return currentIndex;
            }
            
            currentIndex++;            
        }
        
        return index;
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Set<Integer> set=new TreeSet<Integer>();
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			set.add(arr[i]);
		}
		for(int i=1;i<=n;i++)
		{
			if(indexOf(set,i)!=i)
			{
				System.out.print("["+(i-1)+", "+i+"]");
				break;
			}
		}
	}

}