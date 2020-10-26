package test;
public class Employee {
public final static int WagePerHour=20;
public static int totalEmpwages=0;
public final static int FullDay=8;
public final static int DaysPerMonth=20;
public final static int ParTime=8;
public final static int TotalHoursPerMonth=100;
 public static void computeEmpWages( ) {
	 int totalWorkDays=0;
	 int totalempHrs=0;
	 int empHrs=0;
	 while(totalWorkDays < DaysPerMonth && totalempHrs < TotalHoursPerMonth)
	 {
		 totalWorkDays++;
		 int empCheck=(int)Math.floor((Math.random()*10)%3);
		switch(empCheck) {
		case 1:
			//fulltime
			empHrs+=8;
			break;
		case 2:
			//parttime
			empHrs+=8;
			break;
		default:
			//absent
			empHrs+=0;
			break;
		
		}
			totalempHrs+=empHrs;
		 }
	 
	 totalEmpwages=totalempHrs*WagePerHour;
	 System.out.println("total employee wages "+totalEmpwages);
	
}
	public static void main(String[] args) {
		Employee.computeEmpWages();
	}

}