package AssignmentDay9;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String n=new String(sc.nextLine());
		String res="";
		for(int i=0;i<n.length();i++)
		{
			int count=1;
			while(i+1<n.length()&&n.charAt(i)==n.charAt(i+1))
			{
				i++;
				count++;
			}
			if(count==1)
			{
				res+=n.charAt(i)+"";
				//System.out.print(n.charAt(i)+"");
			}
			else
			{
				res+=n.charAt(i)+""+count;
				//System.out.print(n.charAt(i)+""+count);
			}
		}
		System.out.println(res);
		sc.close();
		
		

	}

}
