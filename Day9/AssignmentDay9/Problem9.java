package AssignmentDay9;
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.next());
		int count=1;
		for(int i=1;i<n.length();i++)
		{
			if(n.charAt(i)>64&&n.charAt(i)<91)
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
