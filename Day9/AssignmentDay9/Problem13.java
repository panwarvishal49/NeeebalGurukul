package AssignmentDay9;
import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.nextLine());
		String x[]=n.split(" ");
		String res="";
		for(int i=x.length-1;i>=0;i--)
		{
			res+=x[i]+" ";
		}
		System.out.println(res);
		sc.close();

	}

}
