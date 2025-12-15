import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();
        System.out.println("-----Mini ATM----");
        System.out.println("1.check balance:");
        System.out.println("2.deposit money:");
        System.out.println("3.with draw money:");
        System.out.println("4.exit:");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("balance:"+balance);
                break;
            case 2:
                System.out.println("enter the deposit money:");
                int deposit=sc.nextInt();
                balance=balance+deposit;
                System.out.println(balance);
                System.out.println("updated successfully");
                break;
            case 3:
                System.out.println("withdrawamount:");
                int withdraw=sc.nextInt();
                if(withdraw<=balance){
                balance=balance-withdraw;
                System.out.println("remaining balance:"+balance);
                }
                else{
                    System.out.println("insufficient balance please check your amount");
                }
                break;
            case 4:
                System.out.println("thank you");
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}
                
                
                
        
        
        
        
        