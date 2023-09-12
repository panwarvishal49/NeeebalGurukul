package AssignmentDay9;
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.nextLine());
		int a[]=new int[500];
		for(int i=0;i<n.length();i++)
		{
			a[n.charAt(i)]++;
		}
		String str="{";
		//System.out.print("");
		for(int i=0;i<n.length();i++)
		{
			int freq=a[n.charAt(i)];
			if(freq!=0)
			{
				str+="'"+n.charAt(i)+"':"+freq+"";
				a[n.charAt(i)]=0;
				if(i!=n.length()-1)
				{
					str+=",";
				}
			}
		}
		str+="}";
		System.out.println(str);
		sc.close();
	}

}
