package ex1;
import java.util.ArrayList;

public class Etudiant implements Statisticable, Comparable<Etudiant>{
	private String martricule;
	private String nom;
	ArrayList<Note> Notes;
	
	public Etudiant(String martricule, String nom) {
		super();
		this.martricule = martricule;
		this.nom = nom;
		Notes = new ArrayList<Note>();
	}

	public String getMartricule() {
		return martricule;
	}

	public void setMartricule(String martricule) {
		this.martricule = martricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Note> getNote() {
		return Notes;
	}

	
	
	@Override
	public String toString() {
		return "Etudiant [martricule=" + martricule + ", nom=" + nom + ", Note=" + Notes + "]";
	}

	
	void addNote(Note n) {
		Notes.add(n);
	}
	
	
	@Override
	public double getAVG() {
		double n = 0;
		for(int i=0;i<Notes.size();i++) {
			n=n+ Notes.get(i).getNote();
		}
		double avg = n/Notes.size();
		return avg;
	}
	
	@Override
	public double getMIN() {
		double n = Notes.get(0).getNote();	
		for(int i=0;i<Notes.size();i++) {
			if(n>Notes.get(i).getNote()) {
				n=Notes.get(i).getNote();
			}
		}
		return n ;
	}
	
	
	@Override
	public double getMAX() {
		double n = Notes.get(0).getNote();	
		for(int i=0;i<Notes.size();i++) {
			if(n<Notes.get(i).getNote()) {
				n=Notes.get(i).getNote();
			}
		}
		return n ;
	}
	
	

	@Override
	public int compareTo(Etudiant E) {
		return this.getMartricule().compareTo(E.getMartricule());
	}
	
	
	

}
