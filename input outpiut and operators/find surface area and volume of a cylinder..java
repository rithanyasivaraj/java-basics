import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double surfaceArea = 2 * Math.PI * r * (r + h);
        double volume = Math.PI * r * r * h;
        System.out.println(surfaceArea);
        System.out.println(volume);
        }
}