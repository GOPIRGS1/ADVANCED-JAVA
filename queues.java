import java.util.LinkedList;
import java.util.Queue;
public class queues {
    public static void main(String[] args){
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
        qu.add(2);
        qu.add(2);
        qu.add(1);
        System.out.println(qu);
        qu.remove(2);
        System.out.println(qu);
    }
    
}
