import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double surfaceArea =6*side*side;
        double volume = side*side*side;
        double perimeter = 12*side;
        System.out.println(surfaceArea);
        System.out.println(volume);
        System.out.println(perimeter);
    }
}
