import java.util.Scanner;
public class perimeter {
    public static void main (String []Args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        double length = sc.nextDouble();
        System.out.print("Enter the Width:");
        double width=sc.nextDouble();
        double perimeter=2*(length*width);
        System.out.print("the perimeter of rectangle is:"+ perimeter);
        
    }
    
}
