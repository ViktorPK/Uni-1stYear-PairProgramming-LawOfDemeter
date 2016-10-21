package viktorkristiyan.looselycoupled;

/** 
 *This Class represents the Evidence's and what kind of type are they.
 *@author Viktor
 *@author Kristiyan
 */

public class Evidence {
	
	/**
	 * Creates a String variable of type	
	 * @param type
	 */	
	private String type;

/**
 * 	Class constructor
 * @param type the type of Evidence
 */
	
	public Evidence(String type) { //Class constructor
		this.type = type;
	}

/**
 * toString method
 * @return the type Evidence
 */
	
	public String toString() { //toString method that returns a String representation of the type of Evidence
	return type;
	}
	
/**
 * Gets the type of Evidence 
 * @return the Evidence type
 */

	public String getType() { //Gets the type of Evidence
		return type;
	}
}