import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>0 && b>0){
            System.out.println("quadrant 1");
        }
        else if(a<0 && b>0){
            System.out.println("quadrant 2"); 
        }
        else if(a<0 && b<0){
            System.out.println("quadrant 3");
        }
        else if(a>0 && b<0){
            System.out.println("quadrant 4");
        }
        else if(a==0 && b==0){
            System.out.println("lies at origin");
        }
        else if(a==0){
            System.out.println("point lies on y axis");
        }
        else{
            System.out.println("point lies on x axis");
        }
    }
}
    