import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        int first=n/100;
        int sum=last+first;
        System.out.println(last);
        System.out.println(first);
        System.out.println(sum);
    }
}