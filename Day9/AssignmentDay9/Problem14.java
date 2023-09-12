package AssignmentDay9;
import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.nextLine());
		String temp="";
		String S[]=n.split("[' '|','|':']");
		String m="";
		for(int i=0;i<S.length;i++)
		{
			m+=S[i];
		}
		for(int i=m.length()-1;i>=0;i--)
		{
			
			{
				temp+=m.charAt(i);
			}
		}
		if(m.equalsIgnoreCase(temp))
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
