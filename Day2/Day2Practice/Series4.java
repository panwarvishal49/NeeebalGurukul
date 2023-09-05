package Day2Practice;
import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		double sum=1;
		int fact=1;
		int num=-1;
		for(int i=2;i<=a*2-1;i++)
		{
			fact=i*fact;
			
			if(i%2!=0)
			{
				sum=sum+(double)num/fact;
				num=num*(-1);
			}
			
			
		}
		System.out.println("Answer = "+sum);
		
		
		sc.close();
	}

}
