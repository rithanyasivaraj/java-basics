import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        switch(days){
            case 1:
                System.out.println("monday");
                System.out.println("weekday");
                break;
            case 2:
                System.out.println("tuesday");
                System.out.println("weekday");
                break;
            case 3:
                System.out.println("wednesday");
                System.out.println("weekday");
                break;
            case 4:
                System.out.println("thursday");
                System.out.println("weekday");
                break;
            case 5:
                System.out.println("friday");
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
            System.out.println("no day");
            
                
                
        }
        
    }
}