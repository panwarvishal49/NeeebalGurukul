package AssignmentDay9;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.nextLine());
		String m="";
		
		System.out.print("Enter Replace Character :");
		char a= sc.next().charAt(0);
		
		System.out.print("Enter Replacement Character :");
		String b= sc.next();
		for(int i=0;i<n.length();i++)
		{
			char x = n.charAt(i);
			if(x==a)
			{
				m+=b;
			}
			else
			{
				m+=n.charAt(i);
			}
		}
		System.out.println(m);
		
		sc.close();
	}

}
