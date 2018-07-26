

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import com.sun.prism.paint.Color;

public class Draw extends JLabel {

	public void paintComponent(Graphics g) {


		Window gui = new Window();

		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		

	

		Graphics2D graph = (Graphics2D)g; 
    	Graphics2D graph2 = (Graphics2D)g; 
    	
    	
    	
    	 graph.setStroke(new BasicStroke(10));
    	
    	
    	graph.drawLine(230,100,230,300); 
        

    	graph2.drawLine(130,200,330,200); 


		
		
		
		
		
		
	}

}

