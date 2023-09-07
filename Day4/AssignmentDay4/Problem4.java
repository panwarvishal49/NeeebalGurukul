//The following even sized array shows on and off times of an electric vehicle on a
//particular day in 24 hour format: (850 means 8:50AM, 1330 means 1:30PM)
//int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
//Calculate the running time of the electric vehicle.

package AssignmentDay4;

public class Problem4 {
	
	public static void main(String[] args) {
		int minutes=0,res=0,hours=0;
		int a[] = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
		for(int i=0;i<a.length-1;i+=2)
		{
			
			minutes+=(((a[i+1]/100)-(a[i]/100))*60)+((a[i+1]%100)-(a[i]%100));
			
		}
		hours=minutes/60;
		res=minutes%60;
		System.out.println("Answer = "+hours+"hr "+res+"min ");

	}

}
