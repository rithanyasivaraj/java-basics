import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int basicsalary=sc.nextInt();
        int allowances=sc.nextInt();
        int deductions=sc.nextInt();
        int totalsalary=basicsalary+allowances-deductions;
        System.out.println(totalsalary);
        }
}