package controller;
import exceptions.ChampVideException;
import exceptions.EmailInvalidException;
import model.BilletModel;

public class BilletController {
	
	private BilletDB db = new BilletDB();
	
	public void reserveBillet(String nom, String prenom, String email, String concert, Boolean assise) throws ChampVideException, EmailInvalidException {
		
		BilletModel billet = new BilletModel(nom, prenom, email, concert, assise);
		
		if(billet.isValid())
		{
			db.saveBillet(billet);
		}		
	}		
}
