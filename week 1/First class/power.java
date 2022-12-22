import java.util.Scanner;
public class power{
    public static void main(String[]args){
        Scanner sc=new scanner (System.in);
        System.out.print("Enter the base:");
        int base=sc.nextInt();
        System.out.print("Enter the power:");
        int power=sc.nextInt();
        long result=1;
        while(power!=0){
            result*=base;
            --power;
        }
        System.out.println("the result will be"+result);
    }
}