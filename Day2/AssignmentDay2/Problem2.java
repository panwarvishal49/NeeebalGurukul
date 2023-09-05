//Write a program to accept a coordinate point in a XY coordinate system
//and determine in which quadrant the coordinate point lies.

package AssignmentDay2;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x coordinate : ");
		int x=sc.nextInt();//Getting X-axis
		
		System.out.print("Enter y coordinate : ");
		int y=sc.nextInt();//Getting Y-axis
		
		if(x==0 && y!=0)//checking for y-axis
		{
			System.out.println("Output : Y-Axis");
		}
		else if(y==0 && x!=0)//checking for x-axis
		{
			System.out.println("Output : X-Axis");
		}
		else if(x==0 && y==0){//checking if point lies on origin
			System.out.println("Output : Origin");
		}
		else if(x>0 && y>0) {//checking for 1st quadrant
			System.out.println("Output : 1st Quadrant");
		}
		else if(x<0 && y>0) {//checking for second quadrant
			System.out.println("Output : 2nd Quadrant");
		}
		else if(x<0 && y<0) {//checking for 3rd quadrant
			System.out.println("Output : 3rd Quadrant");
		}
		else {//for 4th quadrant
			System.out.println("Output : 4th Quadrant");
		}
		
		sc.close();
	}

}
