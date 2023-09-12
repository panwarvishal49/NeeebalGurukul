package AssignmentDay9;
import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String a=sc.nextLine();
		String x=a;
		x = " "+x;
		char c[]=x.toCharArray();
		for(int i=0;i<c.length;i++)//approach 1
		{
			if(c[i]==' ')
			{
				if(c[i+1]>='a'&&c[i+1]<='z')
				{
					c[i+1]=(char)(c[i+1]-32);
				}
			}
		}
		x=String.copyValueOf(c);
		x=x.trim();
		System.out.println(x);
		sc.close();
	}

}
