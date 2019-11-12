package project;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Store extends JFrame {
	JButton jbtnRight, jbtnLeft;
	ImageIcon imgLeft, imgRight, imgSM1;
	JLabel jlb;

	Store() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		imgLeft = new ImageIcon("src/images/left.png");
		imgRight = new ImageIcon("src/images/right.png");
		imgSM1 = new ImageIcon("src/images/storemain1.png");
		jbtnRight = new JButton(imgRight);
		jbtnLeft = new JButton(imgLeft);
		jlb = new JLabel(imgSM1);

		jbtnLeft.setBounds(20, 280, 70, 40);
		jbtnRight.setBounds(700, 280, 70, 40);
		jlb.setBounds(0, 0, 800, 600);

		add(jbtnRight);
		add(jbtnLeft);
		add(jlb);

		setBounds(560, 240, 800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Store();
		// 
	}

}
