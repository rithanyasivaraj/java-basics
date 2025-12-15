import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalpens= sc.nextInt();
        int price= sc.nextInt();
        int freepens = (totalpens / 5) * 2;
        int paidpens = totalpens - freepens;
        int totalAmount = paidpens * price;
        System.out.println(freepens);
        System.out.println(paidpens);
        System.out.println(totalAmount);
    }
}
