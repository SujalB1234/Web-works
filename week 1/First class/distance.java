import java.util.Scanner;
public class  distance {
public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of U:");
        double U = sc.nextDouble();
        System.out.print("Enter the value of T:");
        double T = sc.nextDouble();
        System.out.print("Enter the value of A:");
        double A = sc.nextDouble();
        double s = U*T+1/2*(A*T*T);
        System.out.print("the distance travelled is :" + s);
    }
}
