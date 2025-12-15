import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double surfaceArea = 2 * (l*w + w*h + h*l);
        double volume = l * w * h;
        System.out.println(surfaceArea);
        System.out.println(volume);
        }
}