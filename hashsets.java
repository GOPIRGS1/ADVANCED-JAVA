import java.util.HashSet;
public class hashsets {
    public static void main(String[] args){
        HashSet<Integer> hsh =  new HashSet<>();
        hsh.add(1);
        hsh.add(2);
        hsh.add(1);
        hsh.add(2);
        System.out.println(hsh);//duplicate elements will be removed

        hsh.remove(2);
        System.out.println(hsh);// the object can be removed

    }
    
    
}
