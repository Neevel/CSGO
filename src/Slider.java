import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider implements ChangeListener {
	
private Window win; 
	
	public Slider(Window win) {
		this.win = win; 
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource() == win.sliderAlpha) {
		win.textFieldAlpha.setText("" + ((JSlider)e.getSource()).getValue());
		win.d.setAlpha("cl_crosshairalpha\"" + ((JSlider)e.getSource()).getValue()+ "\"");
		win.textArea.setText("cl_crosshairalpha\"" + ((JSlider)e.getSource()).getValue() + "\""); // cl_crosshairthickness
		
		win.textArea.setText(win.d.getAlpha() + "\n" + win.d.getColor()+ "\n" + win.d.getColor_b() + "\n" + win.d.getColor_r()+ "\n" + win.d.getColor_g()
		+ "\n" + win.d.getDot()+ "\n" + win.d.getGap()+ "\n" + win.d.getSize()+ "\n" + win.d.getStyle()+ "\n" + win.d.getUsealpha()+ "\n" + win.d.getThickness()
		+ "\n" + win.d.getFixedcrosshairgap()+ "\n" + win.d.getOutlinethickness()+ "\n" + win.d.getDrawoutline());
		
		} else
			if(e.getSource() == win.sliderThickness) {
				
				win.textFieldThickness.setText("" + ((JSlider)e.getSource()).getValue());
				win.textArea.setText("cl_crosshairthickness\"" + ((JSlider)e.getSource()).getValue() + "\"");
				win.d.setThickness("cl_crosshairthickness\"" + ((JSlider)e.getSource()).getValue()+ "\"");
				
				win.textArea.setText(win.d.getAlpha() + "\n" + win.d.getColor()+ "\n" + win.d.getColor_b() + "\n" + win.d.getColor_r()+ "\n" + win.d.getColor_g()
				+ "\n" + win.d.getDot()+ "\n" + win.d.getGap()+ "\n" + win.d.getSize()+ "\n" + win.d.getStyle()+ "\n" + win.d.getUsealpha()+ "\n" + win.d.getThickness()
				+ "\n" + win.d.getFixedcrosshairgap()+ "\n" + win.d.getOutlinethickness()+ "\n" + win.d.getDrawoutline());
			}else 
				if(e.getSource() == win.sliderSize) {
					win.textFieldSize.setText("" + ((JSlider)e.getSource()).getValue());
					win.textArea.setText("cl_crosshairsize\"" + ((JSlider)e.getSource()).getValue() + "\"");
					win.d.setSize("cl_crosshairsize\"" + ((JSlider)e.getSource()).getValue()+ "\"");
					
					win.textArea.setText(win.d.getAlpha() + "\n" + win.d.getColor()+ "\n" + win.d.getColor_b() + "\n" + win.d.getColor_r()+ "\n" + win.d.getColor_g()
					+ "\n" + win.d.getDot()+ "\n" + win.d.getGap()+ "\n" + win.d.getSize()+ "\n" + win.d.getStyle()+ "\n" + win.d.getUsealpha()+ "\n" + win.d.getThickness()
					+ "\n" + win.d.getFixedcrosshairgap()+ "\n" + win.d.getOutlinethickness()+ "\n" + win.d.getDrawoutline());
				}else
					if(e.getSource() == win.sliderGap) {
						win.textFieldGap.setText("" + ((JSlider)e.getSource()).getValue());
						win.textArea.setText("cl_crosshairgap\"" + ((JSlider)e.getSource()).getValue() + "\"");
						win.d.setGap("cl_crosshairgap\"" + ((JSlider)e.getSource()).getValue()+ "\"");
						win.d.setFixedcrosshairgap("cl_fixedcrosshairgap\"" + ((JSlider)e.getSource()).getValue()+ "\"");
						
						win.textArea.setText(win.d.getAlpha() + "\n" + win.d.getColor()+ "\n" + win.d.getColor_b() + "\n" + win.d.getColor_r()+ "\n" + win.d.getColor_g()
						+ "\n" + win.d.getDot()+ "\n" + win.d.getGap()+ "\n" + win.d.getSize()+ "\n" + win.d.getStyle()+ "\n" + win.d.getUsealpha()+ "\n" + win.d.getThickness()
						+ "\n" + win.d.getFixedcrosshairgap()+ "\n" + win.d.getOutlinethickness()+ "\n" + win.d.getDrawoutline());
					}else
						if(e.getSource() == win.sliderOutline) {
							win.textFieldOutline.setText("" + ((JSlider)e.getSource()).getValue());
							win.textArea.setText("cl_crosshair_outlinethickness\"" + ((JSlider)e.getSource()).getValue() + "\"");
							win.d.setOutlinethickness("cl_crosshair_outlinethickness\"" + ((JSlider)e.getSource()).getValue()+ "\"");
							
							
							win.textArea.setText(win.d.getAlpha() + "\n" + win.d.getColor()+ "\n" + win.d.getColor_b() + "\n" + win.d.getColor_r()+ "\n" + win.d.getColor_g()
							+ "\n" + win.d.getDot()+ "\n" + win.d.getGap()+ "\n" + win.d.getSize()+ "\n" + win.d.getStyle()+ "\n" + win.d.getUsealpha()+ "\n" + win.d.getThickness()
							+ "\n" + win.d.getFixedcrosshairgap()+ "\n" + win.d.getOutlinethickness()+ "\n" + win.d.getDrawoutline());
						}
			
		
  }

	}
	
	
	
	

