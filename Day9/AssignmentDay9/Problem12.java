package AssignmentDay9;
import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.nextLine());
		
		int i=n.indexOf('/');
		if(i!=-1)
		{
			String a=n.substring(i+2);
			int j=a.indexOf('/');
			if(j==-1)
			{
				j=a.indexOf(':');
				if(j==-1)
				{
					System.out.println(a);
				}
				else
				{
					System.out.println(a.substring(0,j));
				}
			}
			else
			{
				System.out.println(a.substring(0,j));
			}
		}
		else
		{
			System.out.println(n);
		}
		sc.close();
		
	}

}
