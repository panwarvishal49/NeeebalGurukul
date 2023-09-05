package Day2Practice;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		int ans=a|1;
		if(ans==a)
		{
			System.out.println("It is Odd number");
		}
		else {
			System.out.println("It is Even number");
		}
		
		
		sc.close();
	}

}
