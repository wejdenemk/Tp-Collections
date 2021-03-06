package ex1;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Etudiant et1 = new Etudiant("1","Nada");
		Etudiant et2 = new Etudiant("2","Mouhamed");
		Etudiant et3 = new Etudiant("3","Mouhib");
		
		Note N1 = new Note("math",8);
		Note N2 = new Note("phy",12);
		Note N3 = new Note("sport",19);
		et1.addNote(N1);
		et1.addNote(N2);
		et1.addNote(N3);
		
		Note N4= new Note("math",10);
		Note N5= new Note("phy",3);
		Note N6= new Note("sport",14);
		et2.addNote(N4);
		et2.addNote(N5);
		et2.addNote(N6);
		
		Note N7 = new Note("math",18);
		Note N8 = new Note("phy",12);
		Note N9= new Note("sport",14);
		et3.addNote(N7);
		et3.addNote(N8);
		et3.addNote(N9);
		
		System.out.println("Moy d'etudiant "+et1.getNom()+": "+et1.getAVG());
		System.out.println("Moy d'etudiant "+et2.getNom()+": "+et2.getAVG());
		System.out.println("Moy d'etudiant "+et3.getNom()+": "+et3.getAVG());
		
		System.out.println("Min note de l'etudiant "+et3.getNom()+": "+et3.getMIN());
		System.out.println("Max note de l'etudiant "+et1.getNom()+": "+et1.getMAX());
		
		System.out.println("Compare par matricule "+ et1.getNom()+" et "+et3.getNom()+" : "+et1.compareTo(et3));
		
		CompareNom compareNom = new CompareNom();
		CompareMoy compareMoy = new CompareMoy();
		
		
		System.out.println("compare name of "+et1.getNom()+" et "+et2.getNom()+" : "+compareNom.compare(et1, et2));
		System.out.println("compare name of "+et2.getNom()+" et "+et3.getNom()+" : "+compareMoy.compare(et2, et3));
		
		ArrayList<Etudiant> list = new ArrayList<>();
		list.add(et1);
		list.add(et2);
		list.add(et3);
		
		Stats stat = new Stats(list);
		stat.getClassDetails();
		System.out.println("\n");
		System.out.println("Class moy : "+stat.getClassAVG());
		System.out.println("Best Student : "+stat.getBestEtudiant().getNom());
		System.out.println("Worst Student : "+stat.getWorstEtudiant().getNom());
		
		
	}

}

