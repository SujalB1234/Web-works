import java.util.Scanner;
public class SI {
  public static void main (String [] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the principal:");
    double principal = sc.nextDouble();
    System.out.print("Enter the rate:");
    double rate = sc.nextDouble();
    System.out.print("Enter the time :");
    double time = sc.nextDouble();
    double simpleinterest = (principal*rate*time)/100;
    double totalamount = principal+simpleinterest;
    System.out.println("the simple interest is:" +  
    simpleinterest);
    System.out.println("the total amount is:" + totalamount);
   }
}

