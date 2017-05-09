import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class game {
  public static void main(String[] args) {

    JPanel mainPanel = new JPanel();

    ImageIcon water1 = new ImageIcon("water1.jpg");
    ImageIcon water2 = new ImageIcon("water2.jpg");
    ImageIcon water3 = new ImageIcon("water3.jpg");
    ImageIcon water4 = new ImageIcon("water4.jpg");

    ImageIcon plank1 = new ImageIcon("plank1.jpg");
    ImageIcon plank1_man = new ImageIcon("plank1_man.jpg");
    ImageIcon plank2 = new ImageIcon("plank2.jpg");
    ImageIcon plank2_man = new ImageIcon("plank2_man.jpg");

    ImageIcon stump1 = new ImageIcon("stump1.jpg");
    ImageIcon stump1_man = new ImageIcon("stump1_man.jpg");
    ImageIcon stump2 = new ImageIcon("stump2.jpg");
    ImageIcon stump2_man = new ImageIcon("stump2_man.jpg");
    ImageIcon stump3 = new ImageIcon("stump3.jpg");
    ImageIcon stump3_man = new ImageIcon("stump3_man.jpg");

    ImageIcon bank1 = new ImageIcon("bank1.jpg");
    ImageIcon bank2 = new ImageIcon("bank2.jpg");

	JButton[][] b = new JButton[9][13];

    for(int x=0; x<13; x++) {
      for(int y=0; y<9; y++) {
		b[y][x] = new JButton(water1);
      }
    }

	for(int y=0; y<9; y++) {
		b[y][0].setIcon(bank2);
    b[y][1].setIcon(bank2);
	}

	for(int y=0; y<9; y++) {
    b[y][11].setIcon(bank1);
		b[y][12].setIcon(bank1);
	}

	b[4][0].setIcon(stump3);
  b[4][1].setIcon(water1);
	b[4][12].setIcon(stump2_man);

  b[0][10].setIcon(stump1);
  b[0][8].setIcon(stump1);
  b[0][6].setIcon(stump1);
  b[0][2].setIcon(stump1);
  b[2][6].setIcon(stump1);
  b[6][6].setIcon(stump1);
  b[4][8].setIcon(stump1);
  b[4][4].setIcon(stump1);

	b[4][11].setIcon(plank2);
	b[4][10].setIcon(plank2);
	b[4][9].setIcon(plank2);
  b[3][6].setIcon(plank1);
  b[4][6].setIcon(plank1);
  b[5][6].setIcon(plank1);
	b[0][9].setIcon(plank2);






    for(int x=0; x<13; x++) {
      for(int y=0; y<9; y++) {
		mainPanel.add(b[y][x]);
      }
    }


    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setTitle("River Crossing Puzzle");
    GridLayout layout = new GridLayout(13, 9, 0, 0);
    mainPanel.setLayout(layout);
    window.setSize(400, 600); //window.setSize(288, 416);
    window.setResizable(true);

    window.setContentPane(mainPanel);
    window.setVisible(true);
  }
}
