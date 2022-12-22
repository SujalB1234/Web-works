import java.util.*;
public class Exercise2{
    public static void main(String[]args){
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("The Hash Set:"+h_set);
        HashSet<String>h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Orange");
        System.out.println("Second HashSet ccontent: "+h_set2);
        h_set1.retainll(h_set2);
        System.out.println("HashSet content:");
        System.out.println(h_set1);
         }
}