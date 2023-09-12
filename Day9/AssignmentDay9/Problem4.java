package AssignmentDay9;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.nextLine());
		n=n.trim();
		String a[]=n.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=" ")
			{
				count++;
			}
		}
		System.out.println("No of Words = "+count);
		sc.close();
	}

}
