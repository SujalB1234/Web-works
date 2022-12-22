import java.util.*;
public class kkkk{
public static void main (String [] args)
{
    Scanner sc = new Scanner(System.in);
    
    double number,sum = 0;
    
    int i, count;
    
    
    System.out.println("how long is the list  ");
    count = sc.nextInt();
    for(i = 1; i <= count ; i++){
        System.out.println("enter positive number :");
        number = sc.nextDouble();
        sum += number;
        
    }
    System.out.println("terminate");
}
}
