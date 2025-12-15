import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double amount=sc.nextDouble();
	double discount=0;
	if(amount<1000){
	    discount=0;
	}
	else if(amount>=1000 && amount<5000){
	    discount=amount*0.05;
	}
	else if(amount>=5000 && amount<10000){
	    discount=amount*0.10;
	}
	else {
	    discount=amount*0.20;
	}
	double finalamount=amount-discount;
	System.out.println(discount);
	System.out.println(finalamount);
	}
}

	


	
	


	   
	


	
	

	
	
	