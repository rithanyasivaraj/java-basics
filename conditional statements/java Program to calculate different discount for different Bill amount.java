import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount=0;
        if(bill<1000){
            discount=0;
            System.out.println("No discount");
        }
        else if(bill>=1000 && bill<5000){
             discount=bill*0.05;
             System.out.println("5% discount");
        }
        else if(bill>=5000 && bill<10000){
            discount=bill*0.10;
            System.out.println("10% discount");
        }
        else{
            discount=bill*0.15;
            System.out.println("15% discount");
        }
        double finalamount=bill-discount;
        System.out.println(discount);
        System.out.println(finalamount);
    }
}
            
            
        
        
        
        