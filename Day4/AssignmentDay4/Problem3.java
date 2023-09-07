//Write a program to store the quarterly sales report in another array and display the
//monthly, quarterly and total sales. (Note: January, February, March and April form the first quarter)
package AssignmentDay4;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int quarter[]=new int[3];
		String b[]= {"January","February","March","April","May","June","July","August","Septembet","October","November","December"};
		System.out.print("Enter Sales of Each Month:");
		int a[]=new int[12];//creating a dynamic size array for storing sales value
		int Total=0;
		for(int i=0;i<12;i++)
		{
			a[i]=sc.nextInt();//inserting value in array
		}
		System.out.println("***     Monthly Sales     ***");
		for(int i=0;i<12;i++)
		{
			System.out.println(b[i]+" -> "+a[i]);
		}
		for(int i=0;i<12;i++)
		{
			Total+=a[i];
			if(i<4)
			{
				quarter[0]+=a[i];
			}
			else if(i<8)
			{
				quarter[1]+=a[i];
			}
			else
			{
				quarter[2]+=a[i];
			}
		}
		System.out.println();
		System.out.println("***     Quaterly Sales     ***");
		for(int i=0;i<quarter.length;i++)
		{
			System.out.println("Quarter "+i+1+" : "+quarter[i]);
		}
		System.out.println();
		System.out.println("***     Total Sales     ***");
		System.out.println("Total sales = "+Total);
		sc.close();
		

	}

}
