import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.event.MenuDragMouseEvent;
import javax.swing.event.MenuDragMouseListener;

public class MouseHandler  implements MouseListener, MouseMotionListener  {
	
//	drag.addMouseListener(new MouseHandler());
//	drag.addMouseMotionListener(new MouseHandler());
	Window w; 
	public MouseHandler(Window w) {
		this.w = w; 
	}
	
	private int pX; 
	private int pY; 
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		pX = e.getX(); 
		pY = e.getY(); 
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		w.setLocation(w.getLocation().x + e.getX() -pX, w.getLocation().y+e.getY() - pY);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	


	

}
