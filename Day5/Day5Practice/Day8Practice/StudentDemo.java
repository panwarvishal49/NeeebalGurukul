package Day8Practice;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student(101,"ABC",23);
		Student t=new Student(123,"YDF",75);
		Student z=new Student(103,"PQ",70);
//		s.setAvg(90);
//		s.setName("Vishal");
//		double a=s.getAvg();
//		System.out.println("Average = "+a);
//		System.out.println(s+"\n"+t+"\n"+z);
		Student g;
		if(s.getAvg()>t.getAvg())
		{
			g=s;
		}
		else {
			g=t;
		}
		if(g.getAvg()<z.getAvg())
		{
			g=z;
		}
		System.out.println(g);
		
		
	}

}
class Student{
	private int roll;
	private String name;
	private double avg;
//	void display() {
//		System.out.println(roll+" "+name+" "+avg);
//	}
	public String toString() {
		return "Roll:"+roll+" Name:"+name+" Average:"+avg;
	}
	void setAvg(double avg)
	{
		this.avg=avg;
	}
	double getAvg() {
		return avg;
	}
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	Student(){
		
	}
	Student(int x,String n,int avg)
	{
		roll=x;
		name=n;
		this.avg=avg;
	}
}
