import java.util.Scanner;
public class  surface {
   public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  radius:");
        double radius = sc.nextDouble();
        double total = 4*22/7*radius*radius;
        double volume = 4/3*22/7*radius*radius*radius;
        System.out.print("the total surface of sphere is :" + 
       total);
        System.out.print("the volume of sphere is :" + volume);
    }
}
