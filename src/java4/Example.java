/**
 * 
 */
package java4;

/**
 * @author Ari
 * @date Feb 3, 2015
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Työntekijä
		Employee e1 = new Employee("Peksi", 30000);
		System.out.println("Nimi: " + e1.getName() + ", Palkka: " + e1.getSalary());
		
		//Pomo
		Manager m1 = new Manager("Pomo", 50000, "Myynti");
		System.out.print("Nimi: " + m1.getName());
		System.out.print(", Palkka: " + m1.getSalary());
		System.out.print(", Osasto: " + m1.getDepartment() + "\n\n");
		
		System.out.println("Ylikuormitetulla displayEmpInfolla: ");
		System.out.println(m1.displayEmpInfo());
		
		System.out.println("\nPalkan muuttamisen jälkeen: ");
		m1.changeSalary(e1, 10000);
		System.out.println(e1.displayEmpInfo());
		
		Employee e2 = new Employee("Jaska", 60000);
		Manager m2 = (Manager)e2;
		System.out.println(m2.displayEmpInfo());
	}

}
