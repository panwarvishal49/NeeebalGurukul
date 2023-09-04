package NeebalGurukulDay1;
import java.util.Scanner;

public class Currency {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Amount :");
		int a = sc.nextInt();
		
		int a1=a/500; a%=500;
		System.out.printf("500 X %d = %d",a1,500*a1).println();
		
		int a2=a/200; a%=200;
		System.out.printf("200 X %d = %d",a2,200*a2).println();
		
		int a3=a/100; a%=100;
		System.out.printf("100 X %d = %d",a3,100*a3).println();
		
		int a4=a/50; a%=50;
		System.out.printf("50 X %d = %d",a4,50*a4).println();
		
		int a5=a/20; a%=20;
		System.out.printf("20 X %d = %d",a5,20*a5).println();
		
		int a6=a/10; a%=10;
		System.out.printf("10 X %d = %d",a6,10*a6).println();
		
		sc.close();
	}

}
