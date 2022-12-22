import java.util.ArrayList;
import java.util.Scanner;
public class arrays{
public static void main(String[] args) {
ArrayList<integer> integer = new ArrayList<Integer>();
integer.add(1);
integer.add(2);
integer.add(3);
integer.add(4);
Scanner sc = new Scanner(System.in);
System.out.println("enter a integer to find");
int a = sc.nextInt();
if(Integer.contains(a)){
System.out.println("the integer is present");
}else
System.out.println("there is no such element");
}
}
}