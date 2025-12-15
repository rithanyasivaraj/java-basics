import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a>=80 && a<=100){
	    System.out.println("battery is full");
	}
	else if(a<80 && a>=50){
	    System.out.println("50% is consumed");
	}
	else if(a<=20){
	    System.out.println("low battery");
	}
	else{
	    System.out.println("invalid percentage");
	}
	}
}
	
	
	