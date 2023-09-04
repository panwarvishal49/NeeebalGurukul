package NeebalGurukulDay1;
import java.util.Scanner;

public class Expression {
	public static void main(String []args) {
		System.out.print("Enter three digit number :");
		Scanner sc=new Scanner(System.in);
		
		int a = sc.nextInt();
		int b=a;
		int a1=b%10;
		int a2=b/10%10;
		int a3=b/10/10;
		System.out.printf("Sum of all digit = %d",a1+a2+a3).println();
		
		int r=a1*100 + a2*10 + a3;
		System.out.println("Reverse of the Number = "+r);
		
		System.out.printf("Sum of number and Reverse = %d",a+r).println();
		
		sc.close();
	}

}
