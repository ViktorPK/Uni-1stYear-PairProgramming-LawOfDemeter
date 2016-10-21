package viktorkristiyan.tightlycoupled;

import java.util.HashSet;

/** 
 *This Class represents the Cop and a method to get the evidence
 *@author Viktor
 *@author Kristiyan
 */

public class Cop {
private String name;
private HashSet<EvidenceBox> boxes;
private HashSet<String> policeList;

/**
 * Constructor for the class
 * @param name represents the name of the cop
 */

public Cop(String name){ //Constructor for the class
	this.name=name; //represents the name of the cop
	policeList= new HashSet<String>(); //represents the cop's police list
	boxes = new HashSet<EvidenceBox>(); //creates a box which will store evidences
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
 * Method which gets the correct evidence from the correct box 
 * @param number the number of the box
 * @param type the type of the evidence to collect
 * @return the policeList which has the evidence in it
 */

public HashSet<String> getEvidence(int number, String type){ //Method which gets the correct evidence from the correct box
for (EvidenceBox e: boxes){
	if (e.getNumber()==number) {
		for (int i=0;i<e.extractEvidences().size();i++){
			if (e.extractEvidences().containsKey(type)){
				if (e.extractEvidences().get(type)==1) policeList.add(type);
				else policeList.add(e.extractEvidences().get(type)+"x " + type);
				
			}
			else policeList.add("None");
		}
	}}
System.out.println("Pieces of "+ type + " Evidence in EvidenceBox number " + number + " found by " + name + ":");
return policeList;
}
}