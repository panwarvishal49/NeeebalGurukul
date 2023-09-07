//The following array contains attendance data of a student:
//int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
//Write a program to find the attendance percentage of this student.
package AssignmentDay4;

public class Problem2 {

	public static void main(String[] args) {
		int a[]= {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		double n=a.length;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1) {
				count+=a[i];
			}
		}
		double ans=(double)(count/n)*100;
		System.out.println("Attendence Percentage = "+ans);

	}

}
