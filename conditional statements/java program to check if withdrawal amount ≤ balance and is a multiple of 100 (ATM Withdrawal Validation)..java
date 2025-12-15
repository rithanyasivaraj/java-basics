import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int withdraw=sc.nextInt();
	int balance=sc.nextInt();
	if(withdraw%100==0 && withdraw<=balance){
	    System.out.println("withdrawal is successfull");
	    System.out.println(balance-withdraw);
	    
	}
	else{
	    System.out.println("withdrawal is not possible");
	}
	}

}
	   
	


	
	

	
	
	