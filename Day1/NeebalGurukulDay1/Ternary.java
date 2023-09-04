package NeebalGurukulDay1;
import java.util.Scanner;


public class Ternary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		
		System.out.println("Enter second number :");
		int c=sc.nextInt();
		
		int d= a>b?a:b;
		int e=d>c?d:c;
		System.out.println("Answer = "+e);
		
		sc.close();
		}

}
