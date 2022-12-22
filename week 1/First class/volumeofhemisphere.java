import java.util.Scanner;
public class volumeofhemisphere {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a radius:");
        double radius = sc.nextDouble();
        double volume = 2/3*22/7*radius*radius*radius;
        System.out.print("the volume of hemisphere is:" + volume);
     }
}
