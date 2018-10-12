/**
 * 
 */
package Assi;

/**
 * @author User
 *version: 1.0
 *Ngay tao:10-10-2018
 */
public  class TechnicalEmployee extends Employee {
	private double thuong;
	public TechnicalEmployee(String name){
		super();
		this.name=name;
		this.baseSalary=5000;
		
	}
	public double getBonusBudget(){
		return getBaseSalary()+this.thuong;
		
	}
	
	public String employeeStatus(){
		return ToString()+"with a budget of "+getBonusBudget();
		
	}

}
