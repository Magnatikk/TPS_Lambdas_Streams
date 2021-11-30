package TP2;

import TP1.PropriétéCours;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Departement {

    private ArrayList<Enseignant> enseignants;
    private ArrayList<Cours> lesCours;



    public Departement() {
	enseignants = new ArrayList<Enseignant>();
	 lesCours = new ArrayList<Cours>();

    }

  
    public void ajouter(Enseignant e) {
	enseignants.add(e);
    }

    public Enseignant getEnseignant(int i) {
	return enseignants.get(i);
    }

  

  public ArrayList<Cours> lesCoursDeMaster() {
    	ArrayList<Cours> coursMaster = new ArrayList<>();
	  for (Cours c : this.lesCours) {
		  if (c.getNiveau().equals(Niveau.M1) || c.getNiveau().equals(Niveau.M2)) {
		  	coursMaster.add(c);
		  }
	  }
	  return coursMaster;
  }

  public ArrayList<Cours> intituleM212() {
    	ArrayList<Cours> coursM212 = new ArrayList<>();
	  for (Cours c : this.lesCours) {
		  if (c.getIntitule().equals("M212")) {
		  	coursM212.add(c);
		  }
	  }
	  return coursM212;
  }

  //Methode utilisant une interface afin de vérifier "plus facilement" les propriétés (nul)

  public Set<Cours> selectionnerCours(Predicate<Cours> condition) {
    	Set<Cours> res = new HashSet<>();
	  for (Cours c : lesCours) {
		  if (condition.test(c)) {
		  	res.add(c);
		  }
	  }
	  return res;
  }

   

    @Override
    public String toString() {
	return "Departement [enseignants=" + enseignants + "\n lesCours= \n"
		+ lesCours + "]";
    }

    
    public void ajouter(Cours c)  {
    	boolean dejaLa=false;
    	for (Cours leCours : lesCours) {
    		if (leCours.equals(c)) {
    			dejaLa=true;
    		}
    	}
    	if(!dejaLa)
    		lesCours.add(c);
    }

 
  

  
 
   
}
