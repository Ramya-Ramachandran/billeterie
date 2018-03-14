import javax.swing.*;

//import com.sun.xml.internal.ws.api.Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;



public class Fenetre extends JFrame implements ActionListener{
	// Création des différents éléments 
	// Titre
	private JLabel titre = new JLabel("Reservation de billets :");
	
	// Texte et TexteField
	private JLabel nom = new JLabel("Nom :");
	private JTextField innom = new JTextField();
	private JLabel prenom = new JLabel("Prénom :");
	private JTextField inprenom = new JTextField();
	private JLabel mail = new JLabel("Mail :");
	private JTextField inmail = new JTextField();
	
	// Liste des concerts 
	private JComboBox concert = new JComboBox();
	
	// Boutons
	private JCheckBox assise = new JCheckBox("Place assise");
	private JButton bouton = new JButton("Reserver");
	
	// Panneau final pour le background
	private Panneau pan = new Panneau();
	
	
	public Fenetre(){
		// Fenetre
		this.setTitle("Reservation de billet.");
	    this.setSize(800, 600);
	    this.setLocationRelativeTo(null);  // Place la fenêtre au milieu
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	    // Liste des concerts
	    concert.setPreferredSize(new Dimension(100, 20));
	    concert.addItem("Against The Current le 18/08");
	    concert.addItem("Johnny le retour le 23/08");
	    concert.addItem("Ozone le 11/09");
	    concert.addItem("Muse le 18/09");
	    
	    // Gestion des police et taille d'écriture
	    titre.setFont(new Font("Serif", Font.PLAIN, 23));
	    nom.setFont(new Font("Serif", Font.PLAIN, 15));
	    prenom.setFont(new Font("Serif", Font.PLAIN, 15));
	    mail.setFont(new Font("Serif", Font.PLAIN, 15));
	    
	    // Panneau Horizontaux et complétion	
	    Box b1 = Box.createHorizontalBox();
	    b1.add(titre);
	    
	    Box b2 = Box.createHorizontalBox();
	    b2.add(nom);
	    b2.add(Box.createRigidArea(new Dimension(25, 0))); // On rajoute des rigides Areas pour la gestion du placement.
	    //innom.setMaximumSize(new Dimension(300,20));
	    innom.setPreferredSize(new Dimension(300,20));
	    b2.add(innom);
	    
	    //System.out.print(inprenom.getPreferredSize());
	    
	    Box b3 = Box.createHorizontalBox();
	    b3.add(prenom);
	    b3.add(Box.createRigidArea(new Dimension(8, 0)));
	    b3.add(inprenom);
	    
	    Box b4 = Box.createHorizontalBox();
	    b4.add(mail);
	    b4.add(Box.createRigidArea(new Dimension(28, 0)));
	    b4.add(inmail);
	    
	    Box b5 = Box.createHorizontalBox();
	    b5.add(Box.createRigidArea(new Dimension(61, 0)));
	    b5.add(concert);
	    
	    Box b6 = Box.createHorizontalBox();
	    b6.add(Box.createRigidArea(new Dimension(21, 0)));
	    b6.add(assise);
	    b6.add(Box.createRigidArea(new Dimension(31, 0)));
	    b6.add(bouton);
	    bouton.addActionListener(this); 	// On définit que le bouton a une action dans la fenêtre
	    
	    
	    // Panneau Vertical composé des panneaux Horizontaux
	    Box bv = Box.createVerticalBox();
	    bv.add(Box.createRigidArea(new Dimension(0, 20)));
	    bv.add(b1);
	    bv.add(Box.createRigidArea(new Dimension(0, 20)));
	    bv.add(b2);
	    bv.add(Box.createRigidArea(new Dimension(0, 4)));
	    bv.add(b3);
	    bv.add(Box.createRigidArea(new Dimension(0, 4)));
	    bv.add(b4);
	    bv.add(Box.createRigidArea(new Dimension(0, 5)));
	    bv.add(b5);
	    bv.add(Box.createRigidArea(new Dimension(0, 7)));
	    bv.add(b6);
	    
	    pan.add(bv);
	    this.setContentPane(pan);
	    
	    this.setVisible(true);
	    
	    // Connection à la BDD
	    /*try {
	        Class.forName("org.postgresql.Driver");
	        System.out.println("Driver O.K.");

	        String url = "jdbc:postgresql://localhost:5432/Billet";
	        String user = "postgres";
	        String passwd = "postgres";

	        Connection conn = DriverManager.getConnection(url, user, passwd);
	        System.out.println("Connexion effective !");         
	           
	      } catch (Exception e) {
	        e.printStackTrace();
	      }  */
	    
	    
	}
	
	public void actionPerformed(ActionEvent arg0) {      
		System.out.println("Nom:" + innom.getText() + " Prenom:" + inprenom.getText() + " mail:"+ inmail.getText() +"\n" + " concert:"+concert.getSelectedItem() + " assise:" + assise.isSelected());
	  } 
}
