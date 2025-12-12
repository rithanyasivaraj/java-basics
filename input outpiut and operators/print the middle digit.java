import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int middle=(n/10)%10;
        System.out.println(middle);
        
    }
}