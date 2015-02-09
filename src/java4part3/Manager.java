/**
 * 
 */
package java4part3;

/**
 * @author Ari
 * @date Feb 3, 2015
 */
public class Manager extends Person implements Printable {

	/**
	 * @param n
	 * @param id
	 */
	public Manager(String n, String id) {
		super(n, id);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java4part3.Printable#print()
	 */
	@Override
	public void print() {
		System.out.println(this.displayInfo());
		
	}
	
	
}
