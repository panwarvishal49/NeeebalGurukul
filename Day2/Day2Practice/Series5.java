package Day2Practice;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		double sum=0;
		double n=Math.toRadians(a);
		int fact=1;
		double num=n;
		for(int i=1;i<=19;i++)
		{
			fact=fact*i;
			if(i%2!=0)
			{
				sum=sum+num/fact;
				num=-num*n*n;
			}
			
			
		}
		System.out.println("Answer = "+sum);
		
		
		sc.close();
	}

}
