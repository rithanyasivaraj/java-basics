import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	if(age<=12){
	    System.out.println("child:$50");
	}
	else if(age>12 && age<=59){
	    System.out.println("adult:$100");
	}
	else {
	    System.out.println("senior citizen:$70");
	}
	}
}


	


	
	


	   
	


	
	

	
	
	