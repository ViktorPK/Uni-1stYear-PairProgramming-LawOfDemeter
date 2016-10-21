package viktorkristiyan.tightlycoupled;

import java.util.HashMap;
import java.util.Map;

/** 
 *This Class represents a Box that contains different types of Evidence and their quantity.
 *@author Viktor
 *@author Kristiyan
 */
public class EvidenceBox {
	private HashMap<String, Integer> evidences;
	private String caseName;
	private int caseNumber;

	/**
	 * Class constructor.Creates a new EvidenceBox with given caseNumber and caseName.
	 * 
	 * @param caseNumber the Number of the case which corresponds for the EvidenceBox
	 * @param caseName the name of the case which corresponds to the EvidenceBox
	 */

	public EvidenceBox(int caseNumber, String caseName) { // Class constructor.Creates a new EvidenceBox with given caseNumber and caseName.
		this.caseNumber = caseNumber;
		this.caseName = caseName;
		evidences = new HashMap<String, Integer>();
	}

	/**
	 * Adds this Evidence to this EvidenceBox
	 *
	 * @param e the Evidence to be added.
	 */
	public void addEvidence(Evidence e) { // Adds this Evidence to this EvidenceBox
		Integer br = evidences.get(e.getType());
		if (evidences.containsKey(e.getType())) {
			evidences.put(e.getType(), new Integer(br + 1));
		} else {
			evidences.put(e.getType(), 1);
		}
	}
/**
 * Gets the number that corresponds to the case for this EvidenceBox
 * @return the caseNumber for this EvidenceBox
 */
	public int getNumber() { //Gets the number that corresponds to the case for this EvidenceBox
		return caseNumber;
	}
	/**
	 * Gets the name that corresponds to the case for this EvidenceBox
	 * @return the caseName for this EvidenceBox
	 */
	public String getName() { //Gets the name that corresponds to the case for this EvidenceBox
		return caseName;
	}
	/**
	 * Prints the contents of this EvidenceBox
	 */
	public void printBox() { //Prints the contents of this EvidenceBox
		for (Map.Entry<String, Integer> entry : evidences.entrySet()) {
			System.out.println(entry.getValue() + "x " + entry.getKey());
		}
	}
	/**
	 * Extracts all evidences in the EvidenceBox in the form of a HashMap
	 * @return the HashMap that stores the evidences of this box
	 */
	public HashMap<String, Integer> extractEvidences() { //Extracts all evidences in the EvidenceBox in the form of a HashMap
		return evidences;
	}
}
