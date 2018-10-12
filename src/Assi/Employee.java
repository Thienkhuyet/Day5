/**
 * 
 */
package Assi;

/**
 * @author User
 *version: 1.0
 *Ngay tao:10-10-2018
 */
public abstract class Employee {
protected String id; 
protected String name;
protected double baseSalary;
protected Employee manager;
/**
 * @return the name
 */

public String getName() {
	return name;
}
/**
 * @param name
 * @param baseSalary
 */

public Employee(String id,String name, double baseSalary) {
	super();
	this.name = name;
	this.baseSalary = baseSalary;
}
/**
 * @param id
 * @param name
 * @param baseSalary
 * @param manager
 */
public Employee(String id, String name, double baseSalary, Employee manager) {
	super();
	this.id = id;
	this.name = name;
	this.baseSalary = baseSalary;
	this.manager = manager;
}
/**
 * 
 */
public Employee() {
	super();
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the baseSalary
 */
public double getBaseSalary() {
	return baseSalary;
}
/**
 * @param baseSalary the baseSalary to set
 */
public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}
public String getIdEmployee(){
	return this.id;
	
}
public boolean equals(Employee other){
	// kiem tra id co giong nhau khong
	if(other.getIdEmployee().equals(other.getIdEmployee())) return false;
	return true;
	
}

public Employee getManager(){
	return manager;
	
}
public String ToString(){
	return this.id+" "+this.name;
}
public  abstract String employeeStatus();
}
