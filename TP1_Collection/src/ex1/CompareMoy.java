package ex1;

import java.util.Comparator;

public class CompareMoy implements Comparator<Etudiant>{
 
	@Override
	public int compare(Etudiant E1, Etudiant E2) {
		int n=0;
		if(E1.getAVG()>E2.getAVG()) {
			n=1;
		}
		else if(E1.getAVG()<E2.getAVG()) {
			n=0;
		}
		return n;
	}	
}
