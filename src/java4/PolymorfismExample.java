/**
 * 
 */
package java4;

import java.util.ArrayList;

/**
 * @author Ari
 * @date Feb 3, 2015
 */
public class PolymorfismExample {


	/**Example of polymorfism
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("Maija", 30000);
		System.out.println(e1.displayEmpInfo());
		
		Manager m1 = new Manager("Pekka", 50000, "Sales");
		System.out.println(m1.displayEmpInfo());
		
		Secretary s1 = new Secretary("Teuvvo", 5000);
		System.out.println(s1.displayEmpInfo());
		
		// The above IS NOT polymorfism. Compiler knows from the reference which method to execute
		/**
		
		ArrayList<Employee> employees= new ArrayList<>();
		
		employees.add(e1);
		employees.add(m1);
		employees.add(s1);

		for (Employee employee : employees) {
			System.out.println(employee.displayEmpInfo());
		}
		
		//Now the compiler finds out by "himself" what method to execute
		**/
	}

}
