public class BilletController {
	
	private BilletDB db = new BilletDB();
	
	public void reserveBillet(String nom, String prenom, String email, String concert, Boolean assise) throws ChampVideException, EmailInvalidException {
		
		Billet billet = new Billet(nom, prenom, email, concert, assise);
		
		if(billet.isValid())
		{
			db.saveBillet(billet);
		}		
	}		
}
