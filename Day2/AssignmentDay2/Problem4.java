//Print first 10 even fibonacii numbers

package AssignmentDay2;

public class Problem4 {

	public static void main(String[] args) {
		int a=0,b=1,c,count=1;
		for(;count<=10;)
		{
			c=a+b;
			a=b;
			b=c;
			if(c%2==0) {//checking for even
				System.out.print("   "+c);//printing result
				count++;//updating count with each even found
			}
		}

	}

}
