package lv.alina.employee;

public class ComissionEmployee extends Employee{
	
	private Double grossComission=0.0;
	private static final Double BONUS_MULTIPLIER=1.5;
		
	public ComissionEmployee(String name, Integer bankAccount,
			Double grossWage) {
		super(name, bankAccount,grossWage);
	}

	@Override
	public Double grossPayment() {
		return grossWage + doCurrentComission()+doCurrentBonus();
	
	}
	
private Double doCurrentComission(){
	Double comission = grossComission;
	//grossComission = 0.0;
	return comission;
}
public void giveComission(Double amount){
	grossComission+=amount;
	//grossComission=grossComission+amount;
}

@Override
public void giveBonus(Double percentage) {
	currentBonus += currentBonus*(percentage/100)*BONUS_MULTIPLIER;
	
}
}
