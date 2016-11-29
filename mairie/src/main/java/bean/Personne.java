package bean;

import java.io.Serializable;

public interface Personne extends Serializable {

	void setAdresse(String adresse);

	String getAdresse();

	void setTel(String tel);

	String getTel();

	void setPrenom(String prenom);

	String getPrenom();

	void setNom(String nom);

	String getNom();

	

	String getId();

	void setPassword(String password);

	String getPassword();

	void setLogin(String login);

	String getLogin();

}
