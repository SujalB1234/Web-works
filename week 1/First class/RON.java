import java.util.Scanner;
public class RON {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder:");
        int radius = sc.nextint();
        System.out.print("Enter the height:");
        int height = sc.nextint();
        double volume = 22/7*radius*radius*height;
        System.out.println("the volume of cylinder is:" +volume);
    }
}