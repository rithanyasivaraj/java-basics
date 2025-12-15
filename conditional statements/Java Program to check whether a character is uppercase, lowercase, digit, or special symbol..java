import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A'&& ch<='Z'){
            System.out.println("uppercase letter");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("lowercase letter");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("digits");
        }
        else{
            System.out.println("symbol");
        }
    }
}