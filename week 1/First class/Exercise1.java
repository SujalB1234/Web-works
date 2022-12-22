 import java.util.*;
public class Exercise1 {
    public static void main (String[] args) {
    List<String> list_Strings = new ArrayList<String>();
    list_Strings.add("Red");
    list_Strings.add("green");
    list_Strings.add("orange");
    list_Strings.add("White");
    list_Strings.add("Black");
    if(list_Strings.contains("Red")){
    System.out.println("Found the element");
    } else {
    System.out.println("There is no such element");
    }
    }
}