import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Batches=sc.nextInt();
        int cakesperBatch=sc.nextInt();
        int totalCakes=Batches*cakesperBatch;
        System.out.println(totalCakes);
        }
}