import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=n%10;
		System.out.println(c);
		if(c%2==0){
		System.out.println("even");
		}
		else{
		    System.out.println("odd");
		}
	}
}
	
