package AssignmentDay9;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=sc.nextLine();
		int count=0;
		boolean flag=true;
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)=='(')
			{
				count++;
			}
			else
			{
				count--;
				if(count<0)
				{
					flag=false;
					break;
				}
			}
		}
		if(count!=0)flag=false;
		if(flag)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		sc.close();

	}

}
