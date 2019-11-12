package project;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameUi extends JFrame implements MouseListener, MouseMotionListener {

	JLabel jbcas, jbhero;
	ImageIcon castle;
	int test = 1;
	ImageIcon hero1 = new ImageIcon("src/heroimg/hero1.png");
	ImageIcon hero2 = new ImageIcon("src/heroimg/hero2.png");
	ImageIcon hero3 = new ImageIcon("src/heroimg/hero3.png");
	ImageIcon hero4 = new ImageIcon("src/heroimg/hero4.png");
	ImageIcon icon[][];

	GameUi() {
		setLayout(null);
		icon = new ImageIcon[4][2];
		for( int i = 0;i<4;i++){
			for (int j = 0; j < 2; j++) {
				icon[i][j] = new ImageIcon("src/heroimg/hero"+(i+1)+"f"+(j+1)+".png");
				System.out.println("src/heroimg/hero"+(i+1)+"f"+(j+1)+".png");
			}
		}
		// ÄÄÆ÷³ÍÆ®
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension d = tool.getScreenSize();
		castle = new ImageIcon("src/images/castle.png");
		jbcas = new JLabel(castle);
		jbhero = new JLabel(hero1);
		double width = d.getWidth();
		double height = d.getHeight();
		int x = (int) (width / 2 - 1500 / 2);
		int y = (int) (height / 2 - 900 / 2);

		add(jbcas);
		add(jbhero);
		jbcas.setBounds(0, 0, 865, 623);
		jbhero.setBounds(200, -23, 150, 300);

		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		setBounds(x, y, 1500, 900);

		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GameUi();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		Random rnd = new Random();
		int temp = 0;
		if (jbhero.getIcon().equals(hero1)) {
			System.out.println("1");
//			temp = rnd.nextInt(2);
			System.out.println("temp : " + temp);
			jbhero.setIcon(icon[0][0]);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (jbhero.getIcon().equals(hero2)) {
			System.out.println("2");
		} else if (jbhero.getIcon().equals(hero3)) {
			System.out.println("3");
		} else if (jbhero.getIcon().equals(hero4)) {
			System.out.println("4");
		}
		

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
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
//		System.out.print("x = " + e.getX() + " ");
//		System.out.println(" y = " + e.getY());
		if (x > 980) {
			jbhero.setIcon(hero1);
		} else if (x > 600) {
			jbhero.setIcon(hero2);
		} else if (x > 400) {
			jbhero.setIcon(hero3);
		} else if (x > 0) {
			jbhero.setIcon(hero4);
		}
//		System.out.println(jbhero.getIcon());
	}

}
