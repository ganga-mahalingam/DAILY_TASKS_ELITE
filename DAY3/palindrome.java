import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int or=n;
	    int rev=0;
	    while(n>0){
	        int dig=n%10;
	        rev=rev*10+dig;
	        n=n/10;
	    }
	    if(or==rev) System.out.println("True");
	    else System.out.println("False");
	}
}
