//Input the lower bound and upper bound then print all the Fibonacci numbers within the bound
//Test case : Input lower =5 and upper= 40
//Output: 5 8 13 21 34


package AssignmentDay2;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lower bound : ");
		int l=sc.nextInt();//getting lower bound
		
		System.out.print("Enter upper bound : ");
		int u=sc.nextInt();//getting upper bound
		
		boolean flag=true;
		int a=0,b=1,c;
		if(l==a)
		{
			System.out.print(" "+a);
		}
		if(l<=b)
		{
			System.out.print(" "+b);
		}
		while(flag)
		{
			c=a+b;
			a=b;
			b=c;
			if(l<=c && u>c) {
				System.out.print(" "+c);
			}
			else if(u<c) {
				flag= false;
				
			}
		}
		sc.close();

	}

}
