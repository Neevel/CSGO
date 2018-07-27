import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;



public class Draw extends JLabel{
	

	
	private static final long serialVersioUID = 1L; 
	
	protected void paintComponent(Graphics g) {
		 
		super.paintComponents(g);
		
		Graphics2D g2d = (Graphics2D) g; 
		
		g.drawImage(ImageLoader.i, 200, 200, 200, 200, null); 
		g2d.drawImage(ImageLoader.i, 200, 200, 200, 200, null); 
		
		repaint(); 
		
		
		
		
	}
	
}
