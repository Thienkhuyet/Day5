/**
 * 
 */
package Assi;

/**
 * @author User
 *version: 1.0
 *Ngay tao:10-10-2018
 */
public class BusinessEmployee extends Employee {
	protected int iSuccessfulCheckin;
public BusinessEmployee(String name){
	super();
	this.name=name;
	this.baseSalary=7500;
}

/* (non-Javadoc)
 * @see Assi.Employee#employeeStatus()
 */
@Override
public String employeeStatus() {
	// TODO Auto-generated method stub
	   return this.id + " " + this.name + " has" 
       + this.iSuccessfulCheckin + " successful check ins " ; 
}
}
