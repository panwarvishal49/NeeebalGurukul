package AssignmentDay9;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.next());
		
		String x[]=n.split("\\.");
		boolean flag=true;
		for(int i=0;i<4;i++)
		{
			int a=Integer.parseInt(x[i]);
			if(a<0||a>255)
			{
				flag=false;
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
