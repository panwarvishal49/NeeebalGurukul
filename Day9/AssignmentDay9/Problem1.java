package AssignmentDay9;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=sc.nextLine();
		String res="";
		String a[]=n.split(" ");
		for(int i=0;i<a.length;i++)
		{
			res+=a[i];
		}
		System.out.println("Result = "+res);
		sc.close();

	}

}
