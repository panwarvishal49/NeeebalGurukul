package Day2Practice;
import java.util.Scanner;

public class BitNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Bit Number : ");
		int b=sc.nextInt();
		
		int c=a>>(b-1);
		int ans=c&1;
		System.out.println("Answer = "+ans);
		
		
	sc.close();	
	}
}
