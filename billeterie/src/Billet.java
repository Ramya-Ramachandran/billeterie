import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


public class Billet {
	private String nom, prenom, email, concert;	
	private Boolean assise;
	
	public Billet(String nom, String prenom, String email, String concert, Boolean assise) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.concert = concert;
		this.assise = assise;
	}
	
	public boolean isValid() throws ChampVideException, EmailInvalidException {
		
		if(isStringNullOrEmpty(this.nom) || isStringNullOrEmpty(this.prenom) || isStringNullOrEmpty(this.prenom)) 
		{
			throw new ChampVideException();
		}		
//		try {
//			InternetAddress ia = new InternetAddress(this.email);
//			ia.validate();
			return true;
//		}		
//		catch (AddressException exp){
//			throw new EmailInvalidException();
//		}		
	}
	
	private static boolean isStringNullOrEmpty(String value)
	{
	  return (value == null || value.trim().equals(""));
	}
	
	// Getter and Setters
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConcert() {
		return concert;
	}

	public void setConcert(String concert) {
		this.concert = concert;
	}

	public Boolean getAssise() {
		return assise;
	}

	public void setAssise(Boolean assise) {
		this.assise = assise;
	}


}
