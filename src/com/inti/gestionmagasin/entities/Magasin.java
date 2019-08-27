package com.inti.gestionmagasin.entities;

public class Magasin {

	//caractéristique d'un magasin
	private long id_mag;
	private String adresse;
	private String location;
	private final int MAX_EMPLOYE=20;
	private int capacity=0;
	private int cap_employe=0;		//capacité d'employé
	private Produit[] tabProduit = new Produit[50];    // declarations d'un tableau de 50 lignes
	private Employe[] esclave = new Employe[MAX_EMPLOYE];		// declaration sur les employés
	
	
	
// Ajout de nouveau produit sans jamais dépasser 50
	//for (i=0, i<=NOMBRE_PRODUIT)
// ==================================================	
	public int getMAX_EMPLOYE() {
		return MAX_EMPLOYE;
	}
		
	public int getCap_employe() {
		return cap_employe;
	}

	public void setCap_employe(int cap_employe) {
		this.cap_employe = cap_employe;
	}

	public Employe[] getEsclave() {
		return esclave;
	}

	public void setEsclave(Employe[] esclave) {
		this.esclave = esclave;
	}

	
	// un magasin vide p1
	public Magasin() {}
	
	// ici je vais entrer les caractéristiques du magasin
	public Magasin (int id_mag, String adresse, String location) {
		this.id_mag=id_mag;
		this.adresse=adresse;
		this.location=location;
	//	this.capacity=capacity;
		}
	
	// avoir les getter et setter...  click droit > source > generate Getter and Setter 

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getId_mag() {
		return id_mag;
	}

	public void setId_mag(long id_mag) {
		this.id_mag = id_mag;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Produit[] getTabProduit() {
		return tabProduit;
	}

	public void setTabProduit(Produit[] tabProduit) {
		this.tabProduit = tabProduit;
	}

//--------------chercher si un produit existe-------------------	
	
	public int chercher (Produit p) {
		for (int i=0; i < capacity; i++) {
			if (tabProduit[i].comparer(p)) {
				return i;
			}
	}
	return -1;
	}
	
//-------------------------------------------------------

//-------------Cherche si un employé existe------------------------
	public int chercherEmploye (Employe e) {
		for (int i=0; i < cap_employe; i++) {
			if (esclave[i].comparer(e)) {
				return i;
			}
	}
	return -1;
	}	
//------------------------------------------------------
	
//-------------Ajouter un produit si le produit n'existe pas----------
	public boolean ajouter (Produit p) {
		if (this.capacity<50 && this.chercher(p) == -1) {		// sa permet de vérifier si le produit n'existe pas dans le stock
			tabProduit[capacity]=p;
			capacity++;
			return true;
	}
		else {
			System.out.println("capacite max ou produit existant");
			return false;
			}
		}
//-----------------------------------------------------------------------	

//-----------------Ajouter un employé si il n'existe pas-----------------
	public boolean ajouterEmploye (Employe e) {
		if (this.cap_employe<50 && this.chercherEmploye(e) == -1) {		// sa permet d'ajouter un employer
			esclave[cap_employe]=e;
			cap_employe++;
			return true;
	}
		else {
			System.out.println("capacite max ou produit existant");
			return false;
			}
		}
//-----------------------------------------------------------------------------	
	
	public void afficher() {
		System.out.println("magasin: \n"+"id: " +id_mag + "\nadresse: " +adresse+ " \ncapacite: " +capacity);
		for (int i=0; i< capacity; i++) {
			System.out.println("produit "+(i+1)+ " \n libelle: "+tabProduit[i].getLibelle() + " prix: "+ tabProduit[i].getPrix());	//on parcourt le tableau 
		}
	}
	
	
	public void AfficheEmploye() {
		for (int j=0; j < cap_employe; j++) {
			System.out.println("\n poste: "+esclave[j].getId() + "\n nom: "+esclave[j].getNom() + "\n Adresse: "+getAdresse() + "\n heures:"+esclave[j].getHeures());
		}
	}
	
} // Fin de code

