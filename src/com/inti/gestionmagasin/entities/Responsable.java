package com.inti.gestionmagasin.entities;

// ici sa marque un probleme parce que je n'ai pas fait le calcul salaire qui était en abstract dans la class mere Employe à la classe fille Responsable
// en gros, il faut que je refasse la formule pour calculer le salaire ( voir la correction )
public class Responsable extends Employe {

	private float prime;
	
	public Responsable() {
		super();			//appel constructeur par défaut de la classe mere
	}
	public Responsable(int id, String nom, String adresse, int heures, float prime) {
		super(id, nom, adresse, heures);
		this.prime = prime;
	}

	
	public float getPrime() {
		return prime;
	}

	public void setPrime(float prime) {
		this.prime = prime;
	}
	
	@Override
	public String toString() {
		return "Responsable: \n\n"+ super.toString()+ "Numero de caisse: " + prime + "]";
	}
	
	@Override
	public float calculSalaire() {
		if ( getHeures()<= 160) {
			return ( getHeures()*10+ getPrime());
		}else
			return ( getHeures()*10)+ getPrime()+(getHeures()-180)*0.15f*10;
	}
	
} //fin de code
