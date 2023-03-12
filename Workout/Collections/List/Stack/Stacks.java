import java.util.*;
class Stacks{
    public static void main(String args[]){
        Stack stack = new Stack();
        for(int i=1;i<=10;i++){
            stack.push(i);
        }
        System.out.println(stack);
        stack.add(1,11);
        stack.add("s");
        stack.add("v");
        System.out.println(stack);
        Stack st = new Stack();
        st.addAll(stack);
        System.out.println(st);
        stack.remove(1);
        System.out.println(stack);
        stack.clear();
        System.out.println(stack);
    }   
}
