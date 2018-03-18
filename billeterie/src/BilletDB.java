import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BilletDB {
	 Connection conn;
	 
	 public BilletDB() {
		 initializeDB();
	 }
	 
	public void initializeDB() {
		try {
	        Class.forName("org.postgresql.Driver");
	        String url = "jdbc:postgresql://localhost:5432/billeterie";
	        String user = "postgres";
	        String passwd = "postgres"; 
	        conn = DriverManager.getConnection(url, user, passwd);
	        System.out.println("DB initialize...");
	      } 
	 catch (Exception e) {
		 e.printStackTrace();
	 } 
	}
	
	public void saveBillet(Billet billet) {
		try {	        
	        Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);			
	        state.executeUpdate("INSERT INTO billet (prenom, nom, mail, concert, assise) VALUES('"+billet.getPrenom()+"','"+billet.getNom()+"','"+billet.getEmail()+"','"+billet.getConcert()+"','"+billet.getAssise()+"')");
	        System.out.println("Informations rentrées dans la BDD");
	      } 
	 catch (Exception e) {
		 e.printStackTrace();
	 } 
	}
}
