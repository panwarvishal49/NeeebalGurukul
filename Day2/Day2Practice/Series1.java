package Day2Practice;
import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		double sum=1;
		for(int i=2;i<=a;i++)
		{
			sum= sum+ (double)1/i;
		}
		System.out.println("Answer = "+sum);
		
		sc.close();
		

	}

}
