package viktorkristiyan.looselycoupled;

import java.util.HashSet;

import viktorkristiyan.looselycoupled.EvidenceBox;

/** 
 *This Class represents the Cop and a method to get the evidence
 *@author Viktor
 *@author Kristiyan
 */

public class Cop {
private String name;
private HashSet<EvidenceBox> boxes;

/**
 * Class constructor
 * @param name the name of the cop

 */

public Cop(String name){ //Class constructor
	this.name=name; //the name of the cop
	boxes = new HashSet<EvidenceBox>();//creates the EvidenceBox
}

/**
 * toString method
 * @return String representation of this Cop object - its name
 */

public String toString(){ //toString method
	return name; //the name of the cop
}

/**
 * adds this EvidenceBox to the Cop's set of boxes
 * @param e the EvidenceBox that is taken by the Cop
 */

public void takeBox(EvidenceBox e){ //Method to take the box
	boxes.add(e); //adds this EvidenceBox to the Cop's set of boxes
}

/**
 * Method to get the evidence from the box
 * @param number the number of the evidence box
 * @param type the type of evidence 
 * @return How much evidence of the correct type is found in the box by the cop
 */

public HashSet<String> getEvidence(int number, String type){ //Method to get the evidence from the box
for (EvidenceBox e: boxes){
	if (e.getNumber()==number) {
	System.out.println("Pieces of "+ type + " Evidence in EvidenceBox number " + number + " found by " + name + ":");
	return e.getEvidenceByType(type); //How much evidence of the correct type is found in the box by the cop
		}
}
return null; 
}


}