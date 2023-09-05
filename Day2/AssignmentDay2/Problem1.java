//Write a program to calculate Cosine series

package AssignmentDay2;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();//Getting angle in Degree
		double sum=1;//Make sum 1 initially
		double n=Math.toRadians(a);//Convert angle in radians
		int fact=1;
		double num=1;
		for(int i=1;i<=19;i++)
		{
			fact=fact*i;//factorial with each iteration
			if(i%2==0)
			{
				num=-num*n*n;//updating num with each iteration
				sum=sum+num/fact;//find sum with each iteration
			}
			
			
		}
		System.out.println("Answer = "+sum);//Here we get answer
		
		
		sc.close(); 

	}

}
