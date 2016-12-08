package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import bean.PersonneBean;

@Table
@Entity
public class PersonneEntite implements Personne  {

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = -419643990935731045L;
	public PersonneEntite() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@Column
	private String login;
	@Column
	private String password;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String tel;
	@Column
	private String adresse;
	@Temporal(TemporalType.TIME)
	private Date dateNaissance;
	
	public String getId() {
		return id;
	}

	private  void setId(String id) {
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
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	
	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
