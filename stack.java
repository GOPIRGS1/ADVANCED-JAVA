import java.util.LinkedList;
public class stack{
    public static void main(String[] args){
        LinkedList<Integer> stk = new LinkedList<>();
        stk.add(23);
        stk.add(56);
        System.out.println(stk);
       

        stk.remove(0);
        System.out.println(stk);
    }
} // also possible for stack ref that note