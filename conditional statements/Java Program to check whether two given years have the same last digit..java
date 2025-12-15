import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int a=n%10;
        int b=c%10;
        if(a==b){
            System.out.println("given years have the same last digit");
        }
        else{
            System.out.println("given years not have the same last digit");
        }
        
    }
}