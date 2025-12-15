import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<10){
            System.out.println("single digit");
        }
        else if(a>9 && a<100){
            System.out.println("two digit");
        }
        else if(a>99 && a<1000){
            System.out.println("three digit");
        }
    }
}
