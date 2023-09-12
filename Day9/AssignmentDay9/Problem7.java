package AssignmentDay9;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.nextLine());
		
		System.out.print("Enter String :");
		String u=new String(sc.nextLine());
		boolean flag=false;
		for(int i=0;i<n.length();i++)
		{
			String x=n.substring(i)+n.substring(0,i);
			if(x.equals(u))
			{
				flag=true;
				break;
			}
		}
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
