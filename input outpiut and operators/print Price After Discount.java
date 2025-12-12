import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();
        double discount =sc.nextDouble();
        double discountAmount = (price * discount) / 100;
        double finalprice = price - discountAmount;
        System.out.println(finalprice);
        
        }
}