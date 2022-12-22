import java.util.Scanner;
public class potential {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mass of energy:");
        double mass = sc.nextDouble();
        System.out.print("Enter the height of energy:");
        double height = sc.nextDouble();
        double energy = mass*9.8*height;
        System.out.println("the potential energy of body is:" + 
        energy);
    }
}
