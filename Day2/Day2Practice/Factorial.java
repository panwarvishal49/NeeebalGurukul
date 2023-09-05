package Day2Practice;
import java.util.Scanner;

public class Factorial {
	
	static int hola(int n) {
		if(n==0||n==1)
		{
			return 1;
		}
		return n* hola(n-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		
		int ans=hola(a);
		System.out.println("Answer = "+ans);
		sc.close();
	}

}
