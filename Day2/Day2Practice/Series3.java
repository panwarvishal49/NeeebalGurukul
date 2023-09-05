package Day2Practice;
import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		int fac=1;
		double sum=1;
		
		for(int i=2;i<=a;i++)
		{
			fac=i*fac;
			sum= sum+ (double)1/fac;
		}
		System.out.println("Answer = "+sum);
		
		sc.close();

	}

}
