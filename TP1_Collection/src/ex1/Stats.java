package ex1;
import java.util.ArrayList;
public class Stats {
	private ArrayList<Etudiant> etudiantsList;

	public Stats(ArrayList<Etudiant> etudiants) {
		super();
		etudiantsList = etudiants;
	}

	
	public void getClassDetails(){
		System.out.print("Stats [etudiantsList=" + etudiantsList + "]");
	}

	
	public double getClassAVG() {
		double n = 0;
		for(int i=0;i<etudiantsList.size();i++) {
			n=n+ etudiantsList.get(i).getAVG();
		}
		double avg = n/etudiantsList.size();
		return avg;
	}
	
	public Etudiant getBestEtudiant() {
		Etudiant n = etudiantsList.get(0);
	    double moy = n.getAVG();
		
		for(int i=0; i<etudiantsList.size();i++) {
			if(moy<etudiantsList.get(i).getAVG()) {
				n = etudiantsList.get(i);
				moy = n.getAVG();
			}
		}
		return n ;
	}
	
	
	public Etudiant getWorstEtudiant() {
		Etudiant n = etudiantsList.get(0);
		double moy = n.getAVG();
		
		for(int i=0; i<etudiantsList.size();i++) {
			if(moy>etudiantsList.get(i).getAVG()) {
				n = etudiantsList.get(i);
				moy = n.getAVG();
			}
		}
		return n; 
	}
	
}
