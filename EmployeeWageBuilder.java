public class EmployeeWageBuilder {
	
	public static void main(String[] args){
	final int PRESENT = 1;
	final int PART_TIME = 2;
	final int FULL_TIME = 8;
	final int WAGE_PER_HOUR = 20;
	int isEmpPresent = (int)(Math.random() *3 );
	int empHr = 0;
	
	//System.out.println(isEmpPresent);
	
	switch(isEmpPresent) {
	
		case PRESENT :
			System.out.println("Emplooyee is Present");
			empHr = FULL_TIME;
			
			break;
			
		case PART_TIME :
			System.out.println("Employee is working part time");
			empHr = FULL_TIME/2;
				
		defualt:
			System.out.println("Employee is absent");
			empHr = 0;
			break;
				}
	int empWage = empHr * WAGE_PER_HOUR;
				System.out.println("Emplooyee Wage : $"+empWage+" USD");
				}

}
					