import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class ActionHandler implements ActionListener {
	
	private Window win; 
	Daten d = new Daten(); 
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
				win.d.setDot("cl_crosshairdot \"0\"");
				win.lblDot.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_dot_0.png")));
				
				
				win.textArea.setText(d.getAlpha() + "\n" + d.getColor() + "\n" + d.getColor_b() + "\n" + d.getColor_r()
				+ "\n" + d.getColor_g() + "\n" + d.getDot() + "\n" + d.getGap() + "\n" + d.getSize() + "\n"
				+ d.getStyle() + "\n" + d.getUsealpha() + "\n" + d.getThickness() + "\n"
				+ d.getFixedcrosshairgap() + "\n" + d.getOutlinethickness() + "\n" + d.getDrawoutline());
				
				
			}else {
				if(source == win.btnChooseColor_1) {
					win.jColorChooser1.setVisible(true);
					System.out.println("asda");
					
				}
			}
	}

}
