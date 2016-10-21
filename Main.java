package viktorkristiyan;

import viktorkristiyan.looselycoupled.*;
//import viktorkristiyan.tightlycoupled.*;

public class Main {

	public static void main(String[] args) {
		//creating a new EvidenceBox with caseNumber - 2005000381 and caseName - S.Avery
		EvidenceBox box = new EvidenceBox(2005000381, "S.Avery"); 
		// creating 2 Cop objects with names - J.Lenk and A.Colborn
		Cop jL = new Cop("J.Lenk");
		Cop aC = new Cop("A.Colborn");
		// creating 3 Evidence objects - 1 of the type vegetative matter and 2 of the type broken glas
		Evidence vM = new Evidence("vegetative matter");
		Evidence bG = new Evidence("broken glass");
		Evidence bG2 = new Evidence("broken glass");
		//giving the box to J.Lenk
		jL.takeBox(box);
		// adding the 3 Evidence objects to the box
		box.addEvidence(vM);
		box.addEvidence(bG);
		box.addEvidence(bG2);
		//printing 2 evidences
		System.out.println(vM);
		System.out.println(bG);
		//printing the contents of the box
		box.printBox();
		// printing the result of the method getEvidence for J.Lenk
		System.out.println(jL.getEvidence(2005000381, "vegetative matter"));

	}

}
