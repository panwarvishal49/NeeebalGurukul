//Write a program to input an array from the user and find the index of the smallest element
//in the array.
package AssignmentDay4;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n= sc.nextInt();//size of array
		int a[]=new int[n];//creating a dynamic size array
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();//inserting value in array
		}
		int mi=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]<a[mi])
			{
				mi=i;
			}
			
		}
		System.out.println("Index of Smallest Element = "+mi);
		sc.close();

	}

}
