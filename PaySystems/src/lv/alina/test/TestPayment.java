package lv.alina.test;

import lv.alina.employee.ComissionEmployee;
import lv.alina.employee.SalaryEmployees;
import lv.alina.paysystem.PaymentSystem;

public class TestPayment {
public static void main(String[]args){
	PaymentSystem paymentSystem = new PaymentSystem();
	
	ComissionEmployee toms = new ComissionEmployee("Toms Ozolins", 1000100, 50.00);
	paymentSystem.addPayee(toms);

	ComissionEmployee ieva = new ComissionEmployee("Ieva Zvaigzne", 2000200, 5634.00);
	paymentSystem.addPayee(ieva);
	
	
	SalaryEmployees olegs = new SalaryEmployees("Olegs Ivanovs", 30303030, 2000.00);
	paymentSystem.addPayee(olegs);
	
	
	SalaryEmployees anete = new SalaryEmployees("Anete Klavina", 30593030, 12345.00);
	paymentSystem.addPayee(anete);
	olegs.giveBonus(10.00);
	ieva.giveBonus(15.0);
	
	// simulate work
	toms.giveComission(4.0);
	toms.giveComission(50.3);
	ieva.giveComission(75.3);
	toms.giveComission(5.0);
	ieva.giveComission(2.5);
	
paymentSystem.processPayments();


}
}
