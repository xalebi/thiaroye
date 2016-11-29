package bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Override
	public String getId() {
		return id;
	}

	private  void setId(String id) {
		this.id = id;
	}
	@Override
	public String getNom() {
		return nom;
	}
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String getPrenom() {
		return prenom;
	}
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String getTel() {
		return tel;
	}
	@Override
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String getAdresse() {
		return adresse;
	}
	@Override
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String getLogin() {
		return login;
	}

	@Override
	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
