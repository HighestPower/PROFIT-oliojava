/**
 * 
 */
package java4part2;

/**
 * @author Ari
 * @date Feb 3, 2015
 */
public class AbsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Pekka", "001");
		
		Manager m1 = new Manager("Jani", "002");
		
		Secretary s1 = new Secretary("Leevi", "003");
		
		System.out.println(e1.displayInfo() + m1.displayInfo() + s1.displayInfo());
		
		//Can't inherit instance from abstract class
		//Person p1 = new Person("Man", "000");
		
	}

}
