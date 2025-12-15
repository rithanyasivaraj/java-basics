import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String signal=sc.next();
	if(signal.equals("green")){
	    System.out.println("go");
	    
	}
	else if(signal.equals("yellow")){
	    System.out.println("ready");
	}
	else if(signal.equals("red")){
	    System.out.println("stop");
	}
	    
	else{
	    System.out.println("invalid");
	    
	}
	}

}
	   
	


	
	

	
	
	