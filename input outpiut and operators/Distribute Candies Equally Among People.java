import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int candies=sc.nextInt();
        int people=sc.nextInt();
        int a=candies%people;
        int b=candies/people;
        System.out.println(a);
        System.out.println(b);
        }
}