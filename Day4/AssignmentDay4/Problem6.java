//The following arrays shows the profits of a company from 2001 to 2010:
//int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
//Write a program to find which year the decline in profits began.
package AssignmentDay4;

public class Problem6 {

	public static void main(String[] args) {
		int a[] = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
		int res=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				res=i+1+2001;
				break;
			}
		}
		System.out.println("Decline in profits began in "+res);

	}

}
