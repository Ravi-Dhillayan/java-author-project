package sankegame;

import java.awt.Color;

import javax.swing.JFrame;

public class Maiin {

	public static void main(String[] args) {
		
   JFrame frame = new JFrame("Snake GAME");
   frame.setBounds(10,10,500,500);
   frame.setResizable(false);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Gamepanel panel=new Gamepanel();
 panel.setBackground(Color.DARK_GRAY);
   
   frame.add(panel);
 // frame.add(panel);
   
   frame.setVisible(true);
	}

}
