import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Panneau extends JPanel {
	public void paintComponent(Graphics g){                
	    /*Font font = new Font("Courier", Font.BOLD, 20);
	    g.setFont(font);
	    g.setColor(Color.red);          
	    g.drawString("Reservation de billet", 10, 20);  */
		try{
			Image img=ImageIO.read(new File("back2.jpg"));
			g.drawImage(img,0,0,800,600,this);
		} catch (IOException e){
			e.printStackTrace();
		}
		
	  }   
	
	  
	 
	  
	  /*public void paint(Graphics comp) {
		  Image img = Toolkit.getDefaultToolkit().getImage("back2.png");
		  comp.drawImage(img,0,0,this);
	  }*/
}