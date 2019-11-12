package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame implements ActionListener{
	///
	ImageIcon imgMain, imgStart, imgStore, imgRank, imgChat;
	JLabel jlb;
	JButton jbtnStart, jbtnStore, jbtnRank, jbtnChat;

	Main() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		imgMain = new ImageIcon("src/images/main.png");
		imgStart = new ImageIcon("src/images/start.png");
		imgStore = new ImageIcon("src/images/store.png");
		imgRank = new ImageIcon("src/images/rank.png");
		imgChat = new ImageIcon("src/images/chat.png");
		
		jlb = new JLabel(imgMain);

		jbtnStart = new JButton(imgStart);
		jbtnStore = new JButton(imgStore);
		jbtnRank = new JButton(imgRank);
		jbtnChat = new JButton(imgChat);

		jbtnStart.setBounds(560, 160, 200, 80);
		jbtnStore.setBounds(560, 260, 200, 80);
		jbtnRank.setBounds(560, 360, 200, 80);
		jbtnChat.setBounds(560, 460, 200, 80);
		
		jbtnStart.addActionListener(this);
		jbtnStore.addActionListener(this);
		jbtnRank.addActionListener(this);
		jbtnChat.addActionListener(this);

		add(jbtnStart);
		add(jbtnStore);
		add(jbtnRank);
		add(jbtnChat);
		add(jlb);
		setResizable(false);
		
		// 중앙에 위치 하게 창 설정 
		setBounds(560, 240, 800, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == jbtnStore) {
			this.setVisible(false);
			new Store();
		}
		
		
	}
}
