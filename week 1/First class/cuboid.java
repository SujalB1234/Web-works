import java.util.Scanner; 
public class cuboid {
 public static void main (String [] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length:");
    double length = sc.nextDouble();
    System.out.print("Enter the breadth:");
    double breadth = sc.nextDouble();
    System.out.print("Enter the height :");
    double height = sc.nextDouble();
    double area = 2*(length * breadth + length * height+ breadth * height);     
    double volume = length*breadth*height;
    System.out.println("the total surface of area is:" + area);
    System.out.println("the volume of cuboid is:" + volume);
   }                                                                                                                    
}                                                                   
