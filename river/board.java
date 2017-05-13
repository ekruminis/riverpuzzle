import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JFrame implements ActionListener {
    // ** make all public **
      public JPanel mainPanel = new JPanel();

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

    	public JButton[][] b = new JButton[9][13];

      public int plankHold = 0;
      public boolean pickUp;
    // ** make all public **
    	// Initialisation of original level 1 board.
    private void levelOne()
    {
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
            b[y][x].addActionListener(this);
    		    mainPanel.add(b[y][x]);
          }
        }
    }

    public JComponent getMainPanel()
    {
      GridLayout layout = new GridLayout(13, 9, 0, 0);
      mainPanel.setLayout(layout);
      levelOne();
      return mainPanel;
    }

    private void update()
    {
      for(int x=0; x<13; x++) {
          for(int y=0; y<9; y++) {
            if(b[y][x].getIcon().equals(stump1_man))
            {
              b[y][x].setIcon(stump1);
            }
            if(b[y][x].getIcon().equals(stump2_man))
            {
              b[y][x].setIcon(stump2);
            }
            if(b[y][x].getIcon().equals(stump3_man))
            {
              b[y][x].setIcon(stump3);
            }
            if(b[y][x].getIcon().equals(plank1_man))
            {
              b[y][x].setIcon(plank1);
            }
            if(b[y][x].getIcon().equals(plank2_man))
            {
              b[y][x].setIcon(plank2);
            }
          }
        }
    }

    private JButton[][] currentMan()
    {
      for(int x=0; x<13; x++) {
          for(int y=0; y<9; y++) {
            if(b[y][x].getIcon().equals(stump1_man) || b[y][x].getIcon().equals(stump2_man) || b[y][x].getIcon().equals(stump3_man) || b[y][x].getIcon().equals(plank1_man) || b[y][x].getIcon().equals(plank2_man))
            {
              return b;
            }
          }
        }
        return b;
    }

    private void move()
    {

    }

    public void actionPerformed(ActionEvent e)
    {
      System.out.println(plankHold);
      JButton source = (JButton)e.getSource();
      for(int x=0; x<13; x++) {
          for(int y=0; y<9; y++) {
            if(b[y][x].equals(source))
            {
              if(b[y][x].getIcon().equals(stump1_man) || b[y][x].getIcon().equals(stump2_man) || b[y][x].getIcon().equals(stump3_man) || b[y][x].getIcon().equals(plank1_man) || b[y][x].getIcon().equals(plank2_man))
              {
                if(source.getIcon().equals(stump1))
                {
                  update();
                  source.setIcon(stump1_man);
                  pickUp = true;
                }

                if(source.getIcon().equals(stump2))
                {
                  update();
                  source.setIcon(stump2_man);
                  pickUp = true;
                }

                if(source.getIcon().equals(stump3))
                {
                  update();
                  source.setIcon(stump3_man);
                  pickUp = true;
                }

                if(source.getIcon().equals(plank1))
                {
                  update();
                  source.setIcon(plank1_man);
                  pickUp = false;
                }

                if(source.getIcon().equals(plank2))
                {
                  update();
                  source.setIcon(plank2_man);
                  pickUp = false;
                }
              }
              if(b[y-1][x].getIcon().equals(stump1_man) || b[y-1][x].getIcon().equals(stump2_man) || b[y-1][x].getIcon().equals(stump3_man) || b[y-1][x].getIcon().equals(plank1_man) || b[y-1][x].getIcon().equals(plank2_man))
              {
                if(source.getIcon().equals(stump1))
                {
                  update();
                  source.setIcon(stump1_man);
                }

                if(source.getIcon().equals(stump2))
                {
                  update();
                  source.setIcon(stump2_man);
                }

                if(source.getIcon().equals(stump3))
                {
                  update();
                  source.setIcon(stump3_man);
                }

                if(source.getIcon().equals(plank1))
                {
                  update();
                  source.setIcon(plank1_man);
                }

                if(source.getIcon().equals(plank2))
                {
                  update();
                  source.setIcon(plank2_man);
                }
              }
              if(b[y+1][x].getIcon().equals(stump1_man) || b[y+1][x].getIcon().equals(stump2_man) || b[y+1][x].getIcon().equals(stump3_man) || b[y+1][x].getIcon().equals(plank1_man) || b[y+1][x].getIcon().equals(plank2_man))
              {
                if(source.getIcon().equals(stump1))
                {
                  update();
                  source.setIcon(stump1_man);
                }

                if(source.getIcon().equals(stump2))
                {
                  update();
                  source.setIcon(stump2_man);
                }

                if(source.getIcon().equals(stump3))
                {
                  update();
                  source.setIcon(stump3_man);
                }

                if(source.getIcon().equals(plank1))
                {
                  update();
                  source.setIcon(plank1_man);
                }

                if(source.getIcon().equals(plank2))
                {
                  update();
                  source.setIcon(plank2_man);
                }
              }
              if(b[y][x-1].getIcon().equals(stump1_man) || b[y][x-1].getIcon().equals(stump2_man) || b[y][x-1].getIcon().equals(stump3_man) || b[y][x-1].getIcon().equals(plank1_man) || b[y][x-1].getIcon().equals(plank2_man))
              {
                if(source.getIcon().equals(stump1))
                {
                  update();
                  source.setIcon(stump1_man);
                }

                if(source.getIcon().equals(stump2))
                {
                  update();
                  source.setIcon(stump2_man);
                }

                if(source.getIcon().equals(stump3))
                {
                  update();
                  source.setIcon(stump3_man);
                }

                if(source.getIcon().equals(plank1))
                {
                  update();
                  source.setIcon(plank1_man);
                }

                if(source.getIcon().equals(plank2))
                {
                  update();
                  source.setIcon(plank2_man);
                }
              }
              if(b[y][x+1].getIcon().equals(stump1_man) || b[y][x+1].getIcon().equals(stump2_man) || b[y][x+1].getIcon().equals(stump3_man) || b[y][x+1].getIcon().equals(plank1_man) || b[y][x+1].getIcon().equals(plank2_man))
              {
                if(source.getIcon().equals(stump1))
                {
                  update();
                  source.setIcon(stump1_man);

                }

                if(source.getIcon().equals(stump2))
                {
                  update();
                  source.setIcon(stump2_man);

                }

                if(source.getIcon().equals(stump3))
                {
                  update();
                  source.setIcon(stump3_man);

                }

                if(source.getIcon().equals(plank1))
                {
                  update();
                  source.setIcon(plank1_man);

                }

                if(source.getIcon().equals(plank2))
                {
                  update();
                  source.setIcon(plank2_man);

                }
              }
            }
          }
        }
    }

/*  public void rightClick()
  {
    for(int x=0; x<13; x++) {
        for(int y=0; y<9; y++) {
          b[y][x].addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e) {
              for(int x=0; x<13; x++) {
                  for(int y=0; y<9; y++) {
                    b[y][x].getModel().setArmed(true);
                    b[y][x].getModel().setPressed(true);
                  }
                }
            }

            public void mouseReleased(MouseEvent e) {
                //if(isRightButtonPressed) {underlyingButton.getModel().setPressed(true));
                for(int x=0; x<13; x++) {
                    for(int y=0; y<9; y++) {
                      b[y][x].getModel().setArmed(false);
                      b[y][x].getModel().setPressed(false);
                    }
                  }

              if (SwingUtilities.isRightMouseButton(e)) {
                JButton source2 = (JButton)e.getSource();
                source2.setIcon(water4);
                }
            }
          });
        }
    }
  }
*/

public void mouseClicked()
 {
   for(int x=0; x<13; x++) {
       for(int y=0; y<9; y++) {
         b[y][x].addMouseListener(new MouseAdapter(){
           public void mousePressed(MouseEvent e)
           {
             if(e.getButton() == MouseEvent.BUTTON3)
             {
               JButton source = (JButton)e.getSource();
               for(int x=0; x<13; x++) {
                   for(int y=0; y<9; y++) {
                     if(b[y][x].equals(source)) {

                         if(b[y][x].getIcon().equals(plank2) && (b[y][x-1].getIcon().equals(stump1_man) || b[y][x-2].getIcon().equals(stump1_man) || b[y][x-3].getIcon().equals(stump1_man)))
                         {
                           plankHold++;
                           b[y][x].setIcon(water1);
                           if(b[y+1][x].getIcon().equals(plank2))
                           {
                             plankHold++;
                             b[y+1][x].setIcon(water1);
                             if(b[y+2][x].getIcon().equals(plank2))
                             {
                               plankHold++;
                               b[y+2][x].setIcon(water1);
                             }
                           }
                         }

                         if(b[y][x].getIcon().equals(plank2) && (b[y][x+1].getIcon().equals(stump1_man) || b[y][x+2].getIcon().equals(stump1_man) || b[y][x+3].getIcon().equals(stump1_man)))
                         {

                           plankHold++;
                           b[y][x].setIcon(water1);
                           if(b[y-1][x].getIcon().equals(plank2))
                           {

                             plankHold++;
                             b[y-1][x].setIcon(water1);
                             if(b[y-2][x].getIcon().equals(plank2))
                             {

                               plankHold++;
                               b[y-2][x].setIcon(water1);
                             }
                           }
                         }
                         if(b[y][x].getIcon().equals(plank1) && (b[y-1][x].getIcon().equals(stump1_man) || b[y-2][x].getIcon().equals(stump1_man) || b[y-3][x].getIcon().equals(stump1_man)))
                         {
                           plankHold++;
                           b[y][x].setIcon(water1);
                           if(b[y][x+1].getIcon().equals(plank1))
                           {
                             plankHold++;
                             b[y][x+1].setIcon(water1);
                             if(b[y][x+2].getIcon().equals(plank1))
                             {
                               plankHold++;
                               b[y][x+2].setIcon(water1);
                             }
                           }
                         }
                         if(b[y][x].getIcon().equals(plank1) && (b[y+1][x].getIcon().equals(stump1_man) || b[y+2][x].getIcon().equals(stump1_man) || b[y+3][x].getIcon().equals(stump1_man)))
                         {
                           plankHold++;
                           b[y][x].setIcon(water1);
                           if(b[y][x-1].getIcon().equals(plank1))
                           {
                             plankHold++;
                             b[y][x-1].setIcon(water1);
                             if(b[y][x-2].getIcon().equals(plank1))
                             {
                               plankHold++;
                               b[y][x-2].setIcon(water1);
                             }
                           }
                         }
                           }
                       }
                     }
                   }
         }
         });
       }
     }
 }

  /**
   * An example of usage
   *
   */

  public static void main(String[] args)
  {
    JFrame window = new JFrame();
    Board board = new Board();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setTitle("River Crossing Puzzle");
    window.setSize(400, 600); //window.setSize(288, 416);
    window.setResizable(true);

    window.setContentPane(board.getMainPanel());
    window.setVisible(true);

    board.mouseClicked();
  }
}
