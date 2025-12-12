import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double score=sc.nextDouble();
        sc.nextLine();
        String department=sc.nextLine();
        System.out.println("my name is:"+name);
        System.out.println("my score is:"+score/10);
        System.out.println("my department is:"+department);
    }
}