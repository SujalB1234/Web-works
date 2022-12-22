import java.util.Scanner;
public class Kilometer {
public static void main(String[] args) {
double kilometers;
System.out.println("Please enter the kilometers");
Scanner in = new Scanner(System.in);
kilometers = in.nextDouble();
double miles = kilometers / 1.609;
System.out.println(miles + " miles");
}
}