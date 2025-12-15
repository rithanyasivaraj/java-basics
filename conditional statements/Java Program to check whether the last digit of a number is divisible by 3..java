import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n%10;
		System.out.println(a);
		if(a%3==0){
		    System.out.println("divisible by 3");
		}
		else{
		    System.out.println("not divisible by 3");
		}
	}
}
	
