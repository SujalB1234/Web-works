import java.util.Scanner;
public class Cube{
      public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a side:");
        double side = sc.nextDouble();
        double area = 6*(side*side);
        System.out.print("the total surface area of cube is:" + area);
        
    }
}
