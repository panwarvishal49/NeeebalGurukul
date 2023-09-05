package Day2Practice;

public class Polar {

	public static void main(String[] args) {
		double r1=6,r2=7;
		double a1=50,a2=50;
		
		double x1,x2,y1,y2;
		x1=r1*(Math.cos(Math.toRadians(a1)));
		x2=r2*(Math.cos(Math.toRadians(a2)));
		
		y1=r1*(Math.sin(Math.toRadians(a1)));
		y2=r2*(Math.sin(Math.toRadians(a2)));
		
		double x3 = x1+x2;
		double y3 = y1+y2;
		
		double r3=Math.sqrt((x3*x3)+(y3*y3));
		
		double a3 = Math.atan(y3/x3);
		double angle = Math.toDegrees(a3);
		
		System.out.println("Answer = "+ r3+"  "+angle);

	}

}
