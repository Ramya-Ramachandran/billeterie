package model;
import java.util.regex.Pattern;
import exceptions.ChampVideException;
import exceptions.EmailInvalidException;


public class BilletModel {
	private String nom, prenom, email, concert;	
	private Boolean assise;
	
	public BilletModel(String nom, String prenom, String email, String concert, Boolean assise) {
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
		
		// email validation
		if(isValidEmail(this.email)) {
			return true;
		} 
		else {
			throw new EmailInvalidException();
		}				
	}
	
	private static boolean isStringNullOrEmpty(String value)
	{
	  return (value == null || value.trim().equals(""));
	}
	
	 public static boolean isValidEmail(String email)
	    {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                            "[a-zA-Z0-9_+&*-]+)*@" +
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                            "A-Z]{2,7}$";
	                             
	        Pattern pat = Pattern.compile(emailRegex);
	        if (email == null)
	            return false;
	        return pat.matcher(email).matches();
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
