import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMangoes = sc.nextInt();
        int price = sc.nextInt();
        int freeMangoes = totalMangoes / 4; 
        int paidMangoes = totalMangoes - freeMangoes;
        int totalAmount = paidMangoes * price;
        System.out.println(freeMangoes);
        System.out.println(paidMangoes);
        System.out.println(totalAmount);
    }
}
