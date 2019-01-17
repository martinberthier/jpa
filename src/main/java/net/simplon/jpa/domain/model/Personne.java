package net.simplon.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String nom;
	
	private String prenom;
	
	
	@ManyToOne
	private Pays pays;
	
	public Personne(String nom, String prenom, Pays pays) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.pays = pays;
	}
	//Un constructeur sans params est nécessaire pour JPA
	protected Personne() {
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}
	
}
