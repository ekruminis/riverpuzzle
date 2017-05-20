import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Levels extends JFrame implements ActionListener{
    // ** make all public **
      public JPanel mainPanel = new JPanel();
      public JPanel gamePanel = new JPanel();
      public JPanel plankPanel = new JPanel();
      public JLabel plankLabel = new JLabel();
      public JFrame window = new JFrame();

      public ImageIcon water1 = new ImageIcon("water1.jpg");
      public ImageIcon water2 = new ImageIcon("water2.jpg");
      public ImageIcon water3 = new ImageIcon("water3.jpg");
      public ImageIcon water4 = new ImageIcon("water4.jpg");

      public ImageIcon plank1 = new ImageIcon("plank1.jpg");
      public ImageIcon plank1_man = new ImageIcon("plank1_man.jpg");
      public ImageIcon plank2 = new ImageIcon("plank2.jpg");
      public ImageIcon plank2_man = new ImageIcon("plank2_man.jpg");

      public ImageIcon stump1 = new ImageIcon("stump1.jpg");
      public ImageIcon stump1_man = new ImageIcon("stump1_man.jpg");
      public ImageIcon stump2 = new ImageIcon("stump2.jpg");
      public ImageIcon stump2_man = new ImageIcon("stump2_man.jpg");
      public ImageIcon stump3 = new ImageIcon("stump3.jpg");
      public ImageIcon stump3_man = new ImageIcon("stump3_man.jpg");

      public ImageIcon bank1 = new ImageIcon("bank1.jpg");
      public ImageIcon bank2 = new ImageIcon("bank2.jpg");
      public ImageIcon bank3 = new ImageIcon("bank3.jpg");

    	public JButton[][] b = new JButton[9][13];

public void levelOne()
{
  for(int x=0; x<13; x++) {
      for(int y=0; y<9; y++) {
          b[y][x] = new JButton(water1);
      }
  }

  for(int y=0; y<9; y++) {
    b[y][0].setIcon(bank3);
    b[y][1].setIcon(bank2);
  }

  for(int y=0; y<9; y++) {
    b[y][11].setIcon(bank1);
    b[y][12].setIcon(bank3);
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

}

public void levelTwo()
{
  for(int x=0; x<13; x++) {
      for(int y=0; y<9; y++) {
          b[y][x] = new JButton(water1);
      }
  }

  for(int y=0; y<9; y++) {
    b[y][0].setIcon(bank3);
    b[y][1].setIcon(bank2);
  }

  for(int y=0; y<9; y++) {
    b[y][11].setIcon(bank1);
    b[y][12].setIcon(bank3);
  }

  b[4][0].setIcon(stump3);
  b[4][1].setIcon(water1);
  b[4][12].setIcon(stump2_man);

  b[4][10].setIcon(stump1);
  b[2][10].setIcon(stump1);
  b[0][10].setIcon(stump1);
  b[0][6].setIcon(stump1);
  b[0][2].setIcon(stump1);
  b[2][2].setIcon(stump1);
  b[4][2].setIcon(stump1);
  b[4][6].setIcon(stump1);
  b[8][6].setIcon(stump1);

  b[4][11].setIcon(plank2);
  b[0][9].setIcon(plank2);
  b[0][8].setIcon(plank2);
  b[0][7].setIcon(plank2);
  b[5][6].setIcon(plank1);
  b[6][6].setIcon(plank1);
  b[7][6].setIcon(plank1);

}

public void levelThree()
{
  for(int x=0; x<13; x++) {
      for(int y=0; y<9; y++) {
          b[y][x] = new JButton(water1);
      }
  }

  for(int y=0; y<9; y++) {
    b[y][0].setIcon(bank3);
    b[y][1].setIcon(bank2);
  }

  for(int y=0; y<9; y++) {
    b[y][11].setIcon(bank1);
    b[y][12].setIcon(bank3);
  }

  b[4][0].setIcon(stump3);
  b[4][1].setIcon(water1);
  b[6][12].setIcon(stump2_man);

  b[6][10].setIcon(stump1);
  b[6][6].setIcon(stump1);
  b[8][6].setIcon(stump1);
  b[2][6].setIcon(stump1);
  b[2][8].setIcon(stump1);
  b[0][2].setIcon(stump1);
  b[0][4].setIcon(stump1);
  b[2][2].setIcon(stump1);
  b[4][4].setIcon(stump1);

  b[2][7].setIcon(plank2);
  b[6][11].setIcon(plank2);
  b[6][9].setIcon(plank2);
  b[6][8].setIcon(plank2);
  b[6][7].setIcon(plank2);

}

public void levelFour()
{
  for(int x=0; x<13; x++) {
      for(int y=0; y<9; y++) {
          b[y][x] = new JButton(water1);
      }
  }

  for(int y=0; y<9; y++) {
    b[y][0].setIcon(bank3);
    b[y][1].setIcon(bank2);
  }

  for(int y=0; y<9; y++) {
    b[y][11].setIcon(bank1);
    b[y][12].setIcon(bank3);
  }

  b[6][0].setIcon(stump3);
  b[6][1].setIcon(water1);
  b[4][12].setIcon(stump2_man);

  b[4][10].setIcon(stump1);
  b[4][8].setIcon(stump1);
  b[4][6].setIcon(stump1);
  b[4][4].setIcon(stump1);
  b[4][2].setIcon(stump1);
  b[0][10].setIcon(stump1);
  b[0][6].setIcon(stump1);
  b[2][6].setIcon(stump1);
  b[8][10].setIcon(stump1);
  b[8][8].setIcon(stump1);
  b[6][4].setIcon(stump1);
  b[2][2].setIcon(stump1);
  b[8][2].setIcon(stump1);

  b[5][2].setIcon(plank1);
  b[6][2].setIcon(plank1);
  b[7][2].setIcon(plank1);

  b[4][11].setIcon(plank2);
  b[8][9].setIcon(plank2);

}
