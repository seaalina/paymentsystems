package lv.alina.employee;


public class SalaryEmployees extends Employee{

		public SalaryEmployees(String name, Integer bankAccount, Double grossWage) {
			super(name, bankAccount, grossWage);
			
			
			
		}

		@Override
		public Double grossPayment() {
			return grossWage+doCurrentBonus();
		

		
	}

		@Override
		public void giveBonus(Double percentage) {
currentBonus += grossWage*(percentage/100.00);
			
		}
		
}
