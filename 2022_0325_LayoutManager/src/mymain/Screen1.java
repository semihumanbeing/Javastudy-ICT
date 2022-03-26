package mymain;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen1 extends JPanel {
	public Screen1() {
		this.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("È­¸é1");
		this.add(label);
		this.setBackground(Color.red);
	}

}
