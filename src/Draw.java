import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Draw {

public  void paint(Graphics g){ 
        
    	Graphics2D graph = (Graphics2D)g; 
    	Graphics2D graph2 = (Graphics2D)g; 
    	
    	
    	
    	 graph.setStroke(new BasicStroke(10));
    	graph.setColor(Color.RED);  
    	
    	graph.drawLine(230,100,230,300); 
        

    	graph2.drawLine(130,200,330,200); 

        
    } 
    

}
