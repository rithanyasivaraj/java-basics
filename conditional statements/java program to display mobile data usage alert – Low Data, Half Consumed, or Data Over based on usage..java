import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		if(data>=90 && data<99){
		    System.out.println("low data");
		}
		else if(data>=50 && data<90){
		    System.out.println("half consumed");
		}
		else if(data==100){
		    System.out.println("data over");
		}
		else if(data>=1 && data<50){
		    System.out.println("full data");
		}
		else{
		    System.out.println("invalid"); 
		}
	}
}