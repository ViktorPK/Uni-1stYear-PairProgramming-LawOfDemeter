package viktorkristiyan.looselycoupled;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/** 
 *This Class represents a Box that contains different types of Evidence and their quantity.
 *@author Viktor
 *@author Kristiyan
 */
public class EvidenceBox {
	private HashMap<String, Integer> evidences;
	private HashSet<String> typeEvidence;
	private String caseName;
	private int caseNumber;

	/**
	 * Class constructor. Creates a new EvidenceBox with given caseNumber and caseName.
	 * 
	 * @param caseNumber the Number of the case which corresponds for the EvidenceBox
	 * @param caseName the name of the case which corresponds to the EvidenceBox
	 */
	public EvidenceBox(int caseNumber, String caseName) { //Class constructor. Creates a new EvidenceBox with given caseNumber and caseName.
		this.caseNumber = caseNumber;
		this.caseName = caseName;
		evidences = new HashMap<String, Integer>();
		typeEvidence = new HashSet<String>();
	}
	
	/**
	 * Adds this Evidence to this EvidenceBox
	 *
	 * @param e the Evidence to be added.
	 */
	public void addEvidence(Evidence e) { //Adds this Evidence to this EvidenceBox
		Integer br = evidences.get(e.getType());
		if (evidences.containsKey(e.getType())) {
			evidences.put(e.getType(), new Integer(br + 1));
		} else {
			evidences.put(e.getType(), 1);
		}
	}
	
	/**
	 * Returns all the Evidence in this box with this type
	 * @param type the type of Evidence to search for in this box
	 * @return a HashSet of Strings representing the objects of the given type and their quantity
	 */
	public HashSet<String> getEvidenceByType(String type) { // Returns all the Evidence in this box with this type
		for (int i = 0; i < evidences.size(); i++) {
			if (evidences.containsKey(type)) {
				if (evidences.get(type) == 1)
					typeEvidence.add(type);
				else
					typeEvidence.add(evidences.get(type) + "x " + type);
			} else
				typeEvidence.add("None");
		}
		return typeEvidence;
	}

	/**
	 * Prints the contents of this EvidenceBox
	 */
	public void printBox() {  //Prints the contents of this EvidenceBox
		for (Map.Entry<String, Integer> entry : evidences.entrySet()) {
			System.out.println(entry.getValue() + "x " + entry.getKey());
		}
	}
	/**
	 * Gets the number that corresponds to the case for this EvidenceBox
	 * @return the caseNumber for this EvidenceBox
	 */
	public int getNumber() { // Gets the number that corresponds to the case for this EvidenceBox
		return caseNumber;
	}
	/**
	 * Gets the name that corresponds to the case for this EvidenceBox
	 * @return the caseName for this EvidenceBox
	 */
	public String getName() { //Gets the name that corresponds to the case for this EvidenceBox
		return caseName;
	}
}
