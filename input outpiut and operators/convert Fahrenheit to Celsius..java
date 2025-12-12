import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit=sc.nextDouble();
        double celsius = (5.0/9)*(fahrenheit-32);
        System.out.println(celsius);
    }

        
}
