import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ActionHandler implements ActionListener {
	
	private Window win; 
	
	public ActionHandler(Window win) {
		this.win = win; 
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		//win.btnExit = (JButton) e.getSource();
		// win.btnVisible = (JButton) e.getSource();

		if (source == win.btnExit) {

			System.exit(0);
			System.out.println("sdfasdf");
		} else

		if (source == win.btnVisible) {

			System.out.println("mini");
			win.setExtendedState(win.ICONIFIED);
		}else
			if(source == win.btnDefault) {
				win.sliderAlpha.setValue(200);
				win.sliderThickness.setValue(1);
				win.sliderSize.setValue(5);
				win.sliderGap.setValue(0);
				win.sliderOutline.setValue(0);
				
				
				
			}
	}

}
