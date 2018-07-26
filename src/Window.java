import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeListener;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Scrollbar;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.DropMode;



public class Window extends JFrame {
	static JButton btnVisible;
	static JButton btnExit;
	JButton btnDefault;
	JToggleButton alphaOnOff;
	JToggleButton outlineOnOff;
	
	JSlider sliderAlpha;
	JSlider sliderThickness;
	JSlider sliderSize;
	JSlider sliderGap;
	JSlider sliderOutline;
	JTextArea textArea ;
	 JTextField textFieldAlpha;
	 JTextField textFieldThickness;
	 JTextField textFieldSize;
	 JTextField textFieldGap;
     JTextField textFieldOutline;
	
	Daten d = new Daten(); 
	
	
	
	
	
	 public Window() {
		
		setSize(1024,768);
		setUndecorated(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(new Rectangle(1, 1, 1, 1));
		scrollPane.setBackground(new Color(200, 100, 100, 100));
		scrollPane.setBounds(250, 580, 500, 160);
		getContentPane().add(scrollPane);
		
		JLabel lblStyle = new JLabel("Style");
		lblStyle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStyle.setForeground(Color.WHITE);
		lblStyle.setBackground(Color.WHITE);
		lblStyle.setBounds(20, 100, 150, 20);
		getContentPane().add(lblStyle);
		
		JLabel lblStyle2 = new JLabel("Alpha");
		lblStyle2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStyle2.setForeground(Color.WHITE);
		lblStyle2.setBackground(Color.WHITE);
		lblStyle2.setBounds(20, 140, 150, 20);
		getContentPane().add(lblStyle2);
		
		JLabel lblStyle3 = new JLabel("Thickness");
		lblStyle3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStyle3.setForeground(Color.WHITE);
		lblStyle3.setBackground(Color.WHITE);
		lblStyle3.setBounds(20, 180, 150, 20);
		getContentPane().add(lblStyle3);
		
		JLabel lblStyle4 = new JLabel("Size");
		lblStyle4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStyle4.setForeground(Color.WHITE);
		lblStyle4.setBackground(Color.WHITE);
		lblStyle4.setBounds(20, 220, 150, 20);
		getContentPane().add(lblStyle4);
		
		JLabel lblStyle5 = new JLabel("Gap");
		lblStyle5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStyle5.setForeground(Color.WHITE);
		lblStyle5.setBackground(Color.WHITE);
		lblStyle5.setBounds(20, 260, 150, 20);
		getContentPane().add(lblStyle5);
		
		JLabel lblStyle6 = new JLabel("Outline");
		lblStyle6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStyle6.setForeground(Color.WHITE);
		lblStyle6.setBackground(Color.WHITE);
		lblStyle6.setBounds(20, 300, 150, 20);
		getContentPane().add(lblStyle6);
		
		JLabel lblStyle7 = new JLabel("Color");
		lblStyle7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStyle7.setForeground(Color.WHITE);
		lblStyle7.setBackground(Color.WHITE);
		lblStyle7.setBounds(20, 340, 150, 20);
		getContentPane().add(lblStyle7);
		
		JLabel lblStyle8 = new JLabel("Dot");
		lblStyle8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStyle8.setForeground(Color.WHITE);
		lblStyle8.setBackground(Color.WHITE);
		lblStyle8.setBounds(20, 460, 150, 20);
		getContentPane().add(lblStyle8);
		
		JLabel lblStyle9 = new JLabel("Preset");
		lblStyle9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStyle9.setForeground(Color.WHITE);
		lblStyle9.setBackground(Color.WHITE);
		lblStyle9.setBounds(20, 500, 150, 20);
		getContentPane().add(lblStyle9);
		
		JLabel lblStyle10 = new JLabel("Config");
		lblStyle10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStyle10.setForeground(Color.WHITE);
		lblStyle10.setBackground(Color.WHITE);
		lblStyle10.setBounds(20, 580, 150, 20);
		getContentPane().add(lblStyle10);
		
		
		 
		JLabel crosshair_alpha_0 = new JLabel("");
		crosshair_alpha_0.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_alpha_0.png")));
		crosshair_alpha_0.setBounds(130, 146, 20, 20);
		getContentPane().add(crosshair_alpha_0);
		
		textArea = new JTextArea(d.getAlpha() +"\n" + d.getColor() + "\n" + d.getColor_b() + "\n" + d.getColor_r() + "\n" + d.getColor_g() + "\n" + d.getDot() + "\n" + d.getGap() +
				 "\n" + d.getSize() + "\n" + d.getStyle() + "\n" + d.getUsealpha() + "\n" + d.getThickness() + "\n" + d.getFixedcrosshairgap() + "\n" + d.getOutlinethickness() + "\n" + d.getDrawoutline());
		textArea.setLineWrap(true);
		
		
		scrollPane.setViewportView(textArea);
		
		JLabel crosshair_alpha_1 = new JLabel("");
		crosshair_alpha_1.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_alpha_1.png")));
		crosshair_alpha_1.setBounds(480, 146, 20, 20);
		getContentPane().add(crosshair_alpha_1);
		
		JLabel crosshair_thickness_0 = new JLabel("");
		crosshair_thickness_0.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_thickness_0.png")));
		crosshair_thickness_0.setBounds(130, 180, 20, 20);
		getContentPane().add(crosshair_thickness_0);
		
		JLabel crosshair_thickness_1 = new JLabel("");
		crosshair_thickness_1.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_thickness_1.png")));
		crosshair_thickness_1.setBounds(480, 180, 20, 20);
		getContentPane().add(crosshair_thickness_1);
		
		JLabel crosshair_size_0 = new JLabel("");
		crosshair_size_0.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_size_0.png")));
		crosshair_size_0.setBounds(130, 220, 20, 20);
		getContentPane().add(crosshair_size_0);
		
		JLabel crosshair_size_1 = new JLabel("");
		crosshair_size_1.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_size_1.png")));
		crosshair_size_1.setBounds(480, 220, 20, 20);
		getContentPane().add(crosshair_size_1);
		
		JLabel crosshair_gap_0 = new JLabel("");
		crosshair_gap_0.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_gap_0.png")));
		crosshair_gap_0.setBounds(130, 265, 20, 20);
		getContentPane().add(crosshair_gap_0);
		
		JLabel crosshair_gap_1 = new JLabel("");
		crosshair_gap_1.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_gap_1.png")));
		crosshair_gap_1.setBounds(480, 265, 20, 20);
		getContentPane().add(crosshair_gap_1);
		
		JLabel crosshair_outline_0 = new JLabel("");
		crosshair_outline_0.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_outline_0.png")));
		crosshair_outline_0.setBounds(130, 305, 20, 20);
		getContentPane().add(crosshair_outline_0);
		
		JLabel crosshair_outline_1 = new JLabel("");
		crosshair_outline_1.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/crosshair_outline_1.png")));
		crosshair_outline_1.setBounds(480, 305, 20, 20);
		getContentPane().add(crosshair_outline_1);
		
		sliderAlpha = new JSlider();
		sliderAlpha.setOpaque(false);
		sliderAlpha.setMaximum(255);
		sliderAlpha.setMinimum(0);
		sliderAlpha.setValue(200);
		sliderAlpha.setBounds(160, 145, 300, 30);
		sliderAlpha.addChangeListener(new Slider(this));
		getContentPane().add(sliderAlpha);
		
		sliderThickness = new JSlider();
		sliderThickness.setMaximum(100);
		sliderThickness.setMinimum(0);
		sliderThickness.setValue(1);
		sliderThickness.setOpaque(false);
		sliderThickness.setBounds(160, 179, 300, 30);
		sliderThickness.addChangeListener(new Slider(this));
		getContentPane().add(sliderThickness);
		
		sliderSize = new JSlider();
		sliderSize.setMaximum(100);
		sliderSize.setMinimum(0);
		sliderSize.setValue(5);
		sliderSize.setOpaque(false);
		sliderSize.setBounds(160, 218, 300, 30);
		sliderSize.addChangeListener(new Slider(this));
		getContentPane().add(sliderSize);
		
		sliderGap = new JSlider();
		sliderGap.setMaximum(100);
		sliderGap.setMinimum(-100);
		sliderGap.setValue(0);
		sliderGap.setOpaque(false);
		sliderGap.setBounds(160, 265, 300, 30);
		sliderGap.addChangeListener(new Slider(this));
		getContentPane().add(sliderGap);
		
		sliderOutline = new JSlider();
		sliderOutline.setMaximum(3);
		sliderOutline.setMinimum(0);
		sliderOutline.setValue(0);
		sliderOutline.setOpaque(false);
		sliderOutline.setBounds(0, 0, 0, 0);
		sliderOutline.addChangeListener(new Slider(this));
		getContentPane().add(sliderOutline);
		
		btnDefault = new JButton("Default");
		btnDefault.setBounds(250, 502, 89, 23);
		btnDefault.addActionListener(new ActionHandler(this));
			
		
		getContentPane().add(btnDefault);
		
		alphaOnOff = new JToggleButton("Enabled");
		alphaOnOff.setBounds(592, 142, 89, 23);
		alphaOnOff.addActionListener(new ActionHandler(this));
		getContentPane().add(alphaOnOff);
		
		//JToggleButton toggleButton = new JToggleButton("Click Me");
		ItemListener itemListenerAlpha = new ItemListener() {
		    public void itemStateChanged(ItemEvent itemEvent) {
		        int state = itemEvent.getStateChange();
		        if (state == ItemEvent.SELECTED) {
		        	alphaOnOff.setText("Disabled");
		        	sliderAlpha.setBounds(0,0,0,0);
		        	d.setUsealpha("cl_crosshairusealpha \"0\"");
		        	textArea.setText(d.getAlpha() + "\n" + d.getColor()+ "\n" + d.getColor_b() + "\n" + d.getColor_r()+ "\n" + d.getColor_g()
					+ "\n" + d.getDot()+ "\n" + d.getGap()+ "\n" + d.getSize()+ "\n" + d.getStyle()+ "\n" + d.getUsealpha()+ "\n" + d.getThickness()
					+ "\n" + d.getFixedcrosshairgap()+ "\n" + d.getOutlinethickness()+ "\n" + d.getDrawoutline());
		           
		        } else {
		        	alphaOnOff.setText("Enabled");
		        	sliderAlpha.setBounds(160, 145, 300, 30);
		        	d.setUsealpha("cl_crosshairusealpha \"1\"");
		        	textArea.setText(d.getAlpha() + "\n" + d.getColor()+ "\n" + d.getColor_b() + "\n" + d.getColor_r()+ "\n" + d.getColor_g()
					+ "\n" + d.getDot()+ "\n" + d.getGap()+ "\n" + d.getSize()+ "\n" + d.getStyle()+ "\n" + d.getUsealpha()+ "\n" + d.getThickness()
					+ "\n" + d.getFixedcrosshairgap()+ "\n" + d.getOutlinethickness()+ "\n" + d.getDrawoutline());
		           
		        }
		    }
		};
		alphaOnOff.addItemListener(itemListenerAlpha);
		
		JToggleButton outlineOnOff = new JToggleButton("Disabled");
		outlineOnOff.setBounds(592, 302, 89, 23);
		getContentPane().add(outlineOnOff);
		
		ItemListener itemListenerOutline = new ItemListener() {
		    public void itemStateChanged(ItemEvent itemEvent) {
		        int state = itemEvent.getStateChange();
		        if (state == ItemEvent.SELECTED) {
		        	outlineOnOff.setText("Enabled");
		        	sliderOutline.setBounds(160, 303, 300, 30);
		        	d.setDrawoutline("cl_crosshair_drawoutline \"1\"");
		        	textArea.setText(d.getAlpha() + "\n" + d.getColor()+ "\n" + d.getColor_b() + "\n" + d.getColor_r()+ "\n" + d.getColor_g()
					+ "\n" + d.getDot()+ "\n" + d.getGap()+ "\n" + d.getSize()+ "\n" + d.getStyle()+ "\n" + d.getUsealpha()+ "\n" + d.getThickness()
					+ "\n" + d.getFixedcrosshairgap()+ "\n" + d.getOutlinethickness()+ "\n" + d.getDrawoutline());
		           
		        } else {
		        	outlineOnOff.setText("Disabled");
		        	sliderOutline.setBounds(0,0,0,0);
		        	d.setDrawoutline("cl_crosshair_drawoutline \"0\"");
		        	textArea.setText(d.getAlpha() + "\n" + d.getColor()+ "\n" + d.getColor_b() + "\n" + d.getColor_r()+ "\n" + d.getColor_g()
					+ "\n" + d.getDot()+ "\n" + d.getGap()+ "\n" + d.getSize()+ "\n" + d.getStyle()+ "\n" + d.getUsealpha()+ "\n" + d.getThickness()
					+ "\n" + d.getFixedcrosshairgap()+ "\n" + d.getOutlinethickness()+ "\n" + d.getDrawoutline());
		           
		        }
		    }
		};
		outlineOnOff.addItemListener(itemListenerOutline);
		
		textFieldAlpha = new JTextField("200");
		textFieldAlpha.setBounds(500, 146, 53, 20);
		getContentPane().add(textFieldAlpha);
		textFieldAlpha.setColumns(10);
		
		textFieldThickness = new JTextField("1");
		textFieldThickness.setColumns(10);
		textFieldThickness.setBounds(500, 180, 53, 20);
		getContentPane().add(textFieldThickness);
		
		textFieldSize = new JTextField("5");
		textFieldSize.setColumns(10);
		textFieldSize.setBounds(500, 220, 53, 20);
		getContentPane().add(textFieldSize);
		
		textFieldGap = new JTextField("0");
		textFieldGap.setColumns(10);
		textFieldGap.setBounds(500, 265, 53, 20);
		getContentPane().add(textFieldGap);
		
		textFieldOutline = new JTextField("0");
		textFieldOutline.setColumns(10);
		textFieldOutline.setBounds(500, 303, 53, 20);
		getContentPane().add(textFieldOutline);
		
		
		JLabel lblProgrammHintergrund = new JLabel("");
		lblProgrammHintergrund.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/programmBackground.png")));
		lblProgrammHintergrund.setBackground(Color.WHITE);
		lblProgrammHintergrund.setBounds(10, 86, 1000, 671);
		getContentPane().add(lblProgrammHintergrund);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Window.class.getResource("/crosshairImage/bg.jpg")));
		lblNewLabel.setBounds(0, 0, 1024, 768);
		getContentPane().add(lblNewLabel);
		
		this.btnVisible = new JButton("");
		this.btnVisible.setBounds(947,10,20,20);
		this.btnVisible.setBackground(new Color(0, 0, 0, 1));
		this.btnVisible.setContentAreaFilled(false);
		this.btnVisible.setBorderPainted(false);
		//this.btnVisible.setForeground(new Color(156, 124, 73,100));
		this.btnVisible.addActionListener(new ActionHandler(this));
		this.btnVisible.requestFocus();
		
		this.btnExit = new JButton("");
		this.btnExit.setBounds(983,10,20,20);
		this.btnExit.setBackground(new Color(0, 0, 0, 1));
		this.btnExit.setContentAreaFilled(false);
		this.btnExit.setBorderPainted(false);
		//this.btnExit.setForeground(new Color(156, 124, 73,100));
		this.btnExit.addActionListener(new ActionHandler(this));
		this.btnExit.addMouseListener(new MouseHandler());
		this.btnExit.requestFocus();
		getContentPane().add(this.btnExit);
		getContentPane().add(this.btnVisible);
		
		
		
		
		setVisible(true);
		
		
	}
	
}
