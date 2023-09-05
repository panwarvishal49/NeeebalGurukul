package Day2Practice;
import java.util.Scanner;

public class sumUsingLoops {

	public static void main(String[] args) {
		int a=7;
		do
		{
			
			System.out.println("Option 1 : Sum of First N numbers:");
			System.out.println("Option 2 : Sum of N numbers:");
			System.out.println("Option 3 : Power of numbers:");
			System.out.println("Option 4 : Exit:");
			System.out.print("Enter Your Option:");
			
			Scanner sc= new Scanner(System.in);
			int t =sc.nextInt();
			switch(t)
			{
				case 1:
					System.out.print("Enter Number:");
					int n=sc.nextInt();
					int sum=0;
					for(int i=1;i<=n;i++)
					{
						sum+=i;
					}
					System.out.printf("Sum of First %d numbers = %d",n,sum).println();
					break;
					
				case 2:
					int res=0;
					System.out.print("Enter Number:");
					int x=sc.nextInt();
					for(int i=0;i<x;i++)
					{
						System.out.print("Enter Value:");
						int temp=sc.nextInt();
						res+=temp;
					}
					System.out.println("Answer = "+res);
					break;
					
				case 3:
					System.out.print("Enter Base:");
					int b=sc.nextInt();
					System.out.print("Enter Power:");
					int p=sc.nextInt();
					int ans=1;
					for(int i=0;i<p;i++)
					{
						ans*=b;
					}
					System.out.println("Answer = "+ans);
					break;
					
				case 4: 
					System.out.print("Good Bye");
					a=4;
					sc.close();
					break;
					
				default :
					System.out.print("Enter Valid Choice");
					break;
							
			}
			if(a!=4) {
				System.out.println("\n           Let's Start Again\n");
			}
			else {
				System.out.println("\n           See You Later\n");
			}
			
		} while(a!=4);
		

	}

}
