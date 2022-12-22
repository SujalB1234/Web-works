import java.util.Scanner;
public class fibonacci{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter a number:");
        int n=sc.nextInt();
        int firstnum=0,
            secondnum=1;
            next num;
            for(int i=1;i<=n;i++){
                System.out.print(firstnum+",");
                nextnum=firstnum+secondnum;
                firstnum= secondnum;
                secondnum = nextnum;
                
            }
        }
    }
