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

    for(int x=0; x<13; x++) {
      for(int y=0; y<9; y++) {
        JButton b = new JButton(stump3_man);

        mainPanel.add(b);
      }
    }

    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setTitle("River Crossing Puzzle");
    GridLayout layout = new GridLayout(13, 9, 0, 0);
    mainPanel.setLayout(layout);
    window.setSize(288, 416);
    window.setResizable(false);

    window.setContentPane(mainPanel);
    window.setVisible(true);
  }
}
