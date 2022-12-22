import java.util.Scanner;
public class  TSA {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  radius:");
        double radius = sc.nextDouble();
        double total = 4*22/7*radius*radius;
        System.out.print("the total surface area of sphere is :" + total);
    }
}
