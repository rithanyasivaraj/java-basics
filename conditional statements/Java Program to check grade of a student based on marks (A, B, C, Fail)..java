import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        int grade=mark/10;
        switch(grade){
            case 9:
            case 10:
                System.out.println("grade A");
                break;
            case 7:
            case 8:
                System.out.println("grade B");
                break;
            case 5:
            case 6:
                System.out.println("grade c");
                break;
            default:
                System.out.println("fail");
        }
        
    }
}