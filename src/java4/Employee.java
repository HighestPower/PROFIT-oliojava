/**
 * 
 */
package java4;

/** Employee class to demonstrate inheritance
 * @author Ari
 *
 */
public class Employee {
	private String name;
	protected int salary;
	
	Employee (String n, int s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	//Työntekijän toString metodi
	public String displayEmpInfo() {
		return "Name: " + name + "\n" +
		"Salary: " + salary + "\n";
	}
}