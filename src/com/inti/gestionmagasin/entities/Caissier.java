package com.inti.gestionmagasin.entities;

public class Caissier extends Employe {

	private float Num_caisse;
	
	public Caissier() {
		super();			//appel constructeur par défaut de la classe mere
	}
	
	public Caissier(int id, String nom, String adresse, int heures, float Num_caisse) {
		super(id, nom, adresse, heures);  // appel constructeur parametré de la classe mère
		this.Num_caisse=Num_caisse;
	}

	public float getNum_caisse() {
		return Num_caisse;
	}

	public void setNum_caisse(float num_caisse) {
		Num_caisse = num_caisse;
	}

	@Override
	public String toString() {
		return "Caissier: \n\n"+ super.toString()+ "Numero de caisse: " + Num_caisse + "]";
	}

	@Override
	public float calculSalaire() {
		if ( getHeures()<=180) {
			return ( getHeures()*5 );
		}
		return (getHeures()*5)+(((getHeures()-180)*1.15f)*5);
	}
	
	
	
} // fin de code
