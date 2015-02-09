/**
 * 
 */
package java4part2;

/**
 * @author Ari
 * @date Feb 3, 2015
 */
public abstract class Person {
	
	private String name;
	private String ID;
		
	/**
	 * 
	 */
	public Person(String n, String id) {
		setName(n);
		ID = id;
		
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	
	public String displayInfo(){
		return "Name: " + getName() + "\nID: " + getID() + "\n"; 
	}

	

}
