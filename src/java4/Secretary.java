/**
 * 
 */
package java4;

/**
 * @author Ari
 * @date Feb 3, 2015
 */
public class Secretary extends Employee {

	/**
	 * @param n
	 * @param s
	 */
	public Secretary(String n, int s) {
		super(n, s);
	}
	
	private void makeReport(Employee e) {
		System.out.println(e.getName() + " has violated the company politics."
				+ "Punishment will be harsh");
	}

	/* (non-Javadoc)
	 * @see java4.Employee#displayEmpInfo()
	 */
	@Override
	public String displayEmpInfo() {
		return super.displayEmpInfo();
	}
	

}
