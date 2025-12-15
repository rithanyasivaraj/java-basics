import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        if (month<1||month>12) {
            System.out.println("Invalid year and month");
        } 
        else {
            boolean isLeap=(year%400==0)||(year%4==0&&year%100!=0);
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
                System.out.println("Valid year and month");
                System.out.println("Number of days 31");
                    
                } 
            else if(month==4||month==6||month==9||month==11) {
                System.out.println("Valid year and month");
                System.out.println("Number of days 30");

            } 
            else if(month==2) {
                System.out.println("Valid year and month");
                if (isLeap)
                    System.out.println("Number of days 29");
                else
                    System.out.println("Number of days 28");
            }
        }
    }
}
