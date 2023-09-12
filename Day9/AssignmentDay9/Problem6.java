package AssignmentDay9;
import java.util.Scanner;

public class Problem6 {
	static boolean palindromic(String x)
	{
		int i=0,j=x.length()-1;
		while(i<j)
		{
			if(x.charAt(i)!=x.charAt(j))
			{
				return false;
			}
			j--;i++;
		}
		return true;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.nextLine());
		String res="";
		for(int i=0;i<n.length();i++)
		{
			for(int j=i+1;j<=n.length();j++)
			{
				String u=n.substring(i,j);
				if(palindromic(u))
				{
					if(res.length()<u.length())
					{
						res="";
						res+=u;
					}
				}
			}
		}
		System.out.println(res);
		sc.close();
	}

}
