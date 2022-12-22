import java.util.Scanner;
public class square {
     public static void main (String [] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the side:");
    double side = sc.nextDouble();
    double area = side*side;
    System.out.println("the area of square is :" + area); 
 }
}
