//Write a program to input an array from the user and reverse the order of elements in an
//array in place i.e. without using any additional arrays.
package AssignmentDay4;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n= sc.nextInt();//size of array
		int a[]=new int[n];//creating a dynamic size array
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();//inserting value in array
		}
		int k=0,j=a.length-1;
		while(k<j)
		{
			int temp=a[k];
			a[k]=a[j];
			a[j]=temp;
			k++;j--;
		}
		System.out.print("Reverse array = ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");//Our output
		}
		sc.close();
		
		

	}

}
