import java.util.Scanner;
public class PES {
     public static void main (String [] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the side:");
    int side = sc.nextInt();
    double perimeter = 4*side;
    System.out.println("the perimeter of square is :" + perimeter); 
 }
}
