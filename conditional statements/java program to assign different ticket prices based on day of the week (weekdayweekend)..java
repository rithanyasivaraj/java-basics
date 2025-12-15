import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String  tickets=sc.nextLine();
	switch(tickets){
	    case "monday":
	    case "tuesday":
	    case "wednesday":
	    case "thursday":
	    case "friday":
	    System.out.println("weekday");
	    System.out.println("weekday 150");
	    break;
	    case "saturday":
	    case "sunday":
	    System.out.println("weekend");
	    System.out.println("weekend 250");
	    break;
	    default:
	    System.out.println("invalid");
	    
	    
	}

	
	}
}