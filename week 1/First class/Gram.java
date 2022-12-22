import java.util.Scanner;
public class  Gram {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  the value of kilogram:");
        double kilogram = sc.nextDouble();
        double gram = kilogram*1000;
        System.out.print("the kilogram convert into gram:"
        +gram);
    }
}
