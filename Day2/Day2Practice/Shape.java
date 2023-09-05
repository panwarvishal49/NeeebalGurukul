package Day2Practice;
import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Shape from below \nCircle \nSquare \nRectangle \nEnter Here : ");
		String shape=sc.nextLine();
		switch(shape)
		{
		case "circle":
		case "CIRCLE":
			System.out.print("Enter Radius of Circle : ");
			int radius = sc.nextInt();
			System.out.println("Area of Circle = "+(3.14*radius*radius));
			break;
		
		case "square":
		case "SQUARE": 
			System.out.print("Enter Side of Circle : ");
			int side = sc.nextInt();
			System.out.println("Area of Square = "+(side*side));
			break;
		
		case "rectangle":
		case "RECTANGLE": 
			System.out.print("Enter Length of Rectangle : ");
			int l = sc.nextInt();
			
			System.out.print("Enter Breadth of Rectangle : ");
			int b = sc.nextInt();
			
			System.out.println("Area of Rectangle = "+(l*b));
			break;
			
		
		default :
			System.out.println("Invalid Shape.");
			break;
		}
		
		
		
		sc.close();
	}

}
