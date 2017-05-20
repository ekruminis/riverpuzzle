import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JFrame implements ActionListener {
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

      private int plankHold = 0;

      public int level = 0;;
    // ** make all public **
    	// Initialisation of original level 1 board.
      public void levelTwo()
      {
        gamePanel.removeAll();
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

        JPanel gamePanel = new JPanel();
        for(int x=0; x<13; x++) {
            for(int y=0; y<9; y++) {
              b[y][x].addActionListener(this);
              gamePanel.add(b[y][x]);
            }
          }
          mouseClicked();
      }

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

        for(int x=0; x<13; x++) {
            for(int y=0; y<9; y++) {
              b[y][x].addActionListener(this);
              gamePanel.add(b[y][x]);
            }
          }
          mouseClicked();
      }

      public void levelThree()
      {
        gamePanel.removeAll();

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

        JPanel gamePanel = new JPanel();
        for(int x=0; x<13; x++) {
            for(int y=0; y<9; y++) {
              b[y][x].addActionListener(this);
              gamePanel.add(b[y][x]);
            }
          }
          mouseClicked();

      }

      public void levelFour()
      {
        gamePanel.removeAll();

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

        JPanel gamePanel = new JPanel();
        for(int x=0; x<13; x++) {
            for(int y=0; y<9; y++) {
              b[y][x].addActionListener(this);
              gamePanel.add(b[y][x]);
            }
          }
          mouseClicked();
      }


    public JFrame getWindow()
    {
      return window;
    }

    public JComponent getGamePanel()
    {
      GridLayout layout = new GridLayout(13, 9, 0, 0);
      gamePanel.setLayout(layout);
      if(level == 0)
      {
        levelOne();
      }
      return gamePanel;
    }

    public int getPlankHold()
    {
      return plankHold;
    }

    public JComponent getPlankPanel()
    {
      plankLabel.setText("Amount of planks being currently held: " + getPlankHold());
      plankPanel.add(plankLabel);
      return plankPanel;
    }


    public JComponent getMainPanel()
    {
      BorderLayout b = new BorderLayout();
      mainPanel.setLayout(b);

      mainPanel.add(getGamePanel(), b.CENTER);
      mainPanel.add(getPlankPanel(), b. NORTH);

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

    public void playing()
    {
      plankLabel.setText("Amount of planks currently being held: " + getPlankHold());
    }

    public void changeLevel()
    {
      for(int x=0; x<13; x++) {
          for(int y=0; y<9; y++) {

              if(level == 0 && b[y][x].getIcon().equals(stump3_man))
              {
                System.out.println("you finished this level 2");
                getGamePanel().revalidate();
                getGamePanel().repaint();
                levelTwo();
                for(int q=0; q<13; q++) {
                    for(int w=0; w<9; w++) {
                      if(b[w][q].getIcon().equals(stump3_man))
                      {
                        level++;
                      }
                      b[w][q].addActionListener(this);
                      gamePanel.add(b[w][q]);
                    }
                  }
                getMainPanel();
                getWindow().setContentPane(getMainPanel());
              }
              if(level == 1 && b[y][x].getIcon().equals(stump3_man))
              {
                System.out.println("you finished this level 3");
                getGamePanel().revalidate();
                getGamePanel().repaint();
                levelThree();
                for(int q=0; q<13; q++) {
                    for(int w=0; w<9; w++) {
                      b[w][q].addActionListener(this);
                      gamePanel.add(b[w][q]);
                      if(b[w][q].getIcon().equals(stump3_man))
                      {
                        level++;
                      }
                    }
                  }
                getMainPanel();
                getWindow().setContentPane(getMainPanel());
              }
              if(level == 2 && b[y][x].getIcon().equals(stump3_man))
              {
                System.out.println("you finished this level 4");
                getGamePanel().revalidate();
                getGamePanel().repaint();
                levelFour();
                for(int q=0; q<13; q++) {
                    for(int w=0; w<9; w++) {
                      b[w][q].addActionListener(this);
                      gamePanel.add(b[w][q]);
                    }
                  }
                getMainPanel();
                getWindow().setContentPane(getMainPanel());
              }
              if(level == 3 && b[y][x].getIcon().equals(stump3_man))
              {
                JOptionPane.showMessageDialog(getWindow(),"Congratulations, you beat the game!");
              }
            }
          }
    }

    public void actionPerformed(ActionEvent e)
    {
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
                  level++;
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

              if(b[0][x].getIcon().equals(stump1_man) || b[0][x].getIcon().equals(stump2_man) || b[0][x].getIcon().equals(stump3_man) || b[0][x].getIcon().equals(plank1_man) || b[0][x].getIcon().equals(plank2_man))
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
                  level++;
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

              if(b[y][0].getIcon().equals(stump1_man) || b[y][0].getIcon().equals(stump2_man) || b[y][0].getIcon().equals(stump3_man) || b[y][0].getIcon().equals(plank1_man) || b[y][0].getIcon().equals(plank2_man))
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
                  level++;
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

              if( (y-1) > 0 && (b[y-1][x].getIcon().equals(stump1_man) || b[y-1][x].getIcon().equals(stump2_man) || b[y-1][x].getIcon().equals(stump3_man) || b[y-1][x].getIcon().equals(plank1_man) || b[y-1][x].getIcon().equals(plank2_man)))
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
                  level++;
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

              if( (y+1) < 9 && (b[y+1][x].getIcon().equals(stump1_man) || b[y+1][x].getIcon().equals(stump2_man) || b[y+1][x].getIcon().equals(stump3_man) || b[y+1][x].getIcon().equals(plank1_man) || b[y+1][x].getIcon().equals(plank2_man)))
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
                  level++;
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

              if( (x-1) > 0 && (b[y][x-1].getIcon().equals(stump1_man) || b[y][x-1].getIcon().equals(stump2_man) || b[y][x-1].getIcon().equals(stump3_man) || b[y][x-1].getIcon().equals(plank1_man) || b[y][x-1].getIcon().equals(plank2_man)))
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
                  level++;
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

              if( (x+1) < 13 && (b[y][x+1].getIcon().equals(stump1_man) || b[y][x+1].getIcon().equals(stump2_man) || b[y][x+1].getIcon().equals(stump3_man) || b[y][x+1].getIcon().equals(plank1_man) || b[y][x+1].getIcon().equals(plank2_man)))
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
                  level++;
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
                     if(b[y][x].equals(source) && plankHold < 3)
                     {
                       if(b[y][x].getIcon().equals(plank1) || b[y][x].getIcon().equals(plank2))
                       {
                         if( (x-3) > -1 && (b[y][x-1].getIcon().equals(stump1_man) || b[y][x-2].getIcon().equals(stump1_man) || b[y][x-3].getIcon().equals(stump1_man)))
                         {
                           plankHold++;
                           plankHold = Math.min(3,plankHold);
                           b[y][x].setIcon(water1);
                         }
                         if( (y-3) > -1 && (b[y-1][x].getIcon().equals(stump1_man) || b[y-2][x].getIcon().equals(stump1_man) || b[y-3][x].getIcon().equals(stump1_man)))
                         {
                           plankHold++;
                           plankHold = Math.min(3,plankHold);
                           b[y][x].setIcon(water1);
                         }
                         if( (y+3) < 9 && (b[y+1][x].getIcon().equals(stump1_man) || b[y+2][x].getIcon().equals(stump1_man) || b[y+3][x].getIcon().equals(stump1_man)))
                         {
                           plankHold++;
                           plankHold = Math.min(3,plankHold);
                           b[y][x].setIcon(water1);
                         }
                         if( (x+3) < 13 && (b[y][x+1].getIcon().equals(stump1_man) || b[y][x+2].getIcon().equals(stump1_man) || b[y][x+3].getIcon().equals(stump1_man)))
                         {
                           plankHold++;
                           plankHold = Math.min(3,plankHold);
                           b[y][x].setIcon(water1);
                         }
                         if(b[y][0].getIcon().equals(stump1_man) || b[y][0].getIcon().equals(stump1_man) || b[y][0].getIcon().equals(stump1_man))
                         {
                           plankHold++;
                           plankHold = Math.min(3,plankHold);
                           b[y][x].setIcon(water1);
                         }
                         if(b[0][x].getIcon().equals(stump1_man) || b[0][x].getIcon().equals(stump1_man) || b[0][x].getIcon().equals(stump1_man))
                         {
                           plankHold++;
                           plankHold = Math.min(3,plankHold);
                           b[y][x].setIcon(water1);
                         }
                       }
                     }

                    }
                  }
                }

                if(e.getButton() == MouseEvent.BUTTON2)
                {
                  JButton source = (JButton)e.getSource();
                  for(int x=0; x<13; x++) {
                      for(int y=0; y<9; y++) {
                        if(b[y][x].equals(source) && plankHold != 0) {
                            if(b[y][x].getIcon().equals(water1))
                            {
                							if( (x-3) > -1 && (b[y][x-1].getIcon().equals(stump1_man) || b[y][x-2].getIcon().equals(stump1_man) || b[y][x-3].getIcon().equals(stump1_man)))
                              {
                								plankHold--;
                                plankHold = Math.max(0,plankHold);
                								b[y][x].setIcon(plank2);
                							}
                						  if( (y-3) > -1 && (b[y-1][x].getIcon().equals(stump1_man) || b[y-2][x].getIcon().equals(stump1_man) || b[y-3][x].getIcon().equals(stump1_man)))
                              {
                                plankHold--;
                                plankHold = Math.max(0,plankHold);
                							  b[y][x].setIcon(plank1);
                						  }
                						  if( (y+3) < 9 && (b[y+1][x].getIcon().equals(stump1_man) || b[y+2][x].getIcon().equals(stump1_man) || b[y+3][x].getIcon().equals(stump1_man)))
                              {
                                plankHold--;
                                plankHold = Math.max(0,plankHold);
                							  b[y][x].setIcon(plank1);
                						  }
                						  if( (x+3) < 13 && (b[y][x+1].getIcon().equals(stump1_man) || b[y][x+2].getIcon().equals(stump1_man) || b[y][x+3].getIcon().equals(stump1_man)))
                              {
                                plankHold--;
                                plankHold = Math.max(0,plankHold);
                							  b[y][x].setIcon(plank2);
                						  }
                						  if(b[y][0].getIcon().equals(stump1_man) || b[y][0].getIcon().equals(stump1_man) || b[y][0].getIcon().equals(stump1_man))
                						  {
                                plankHold--;
                                plankHold = Math.max(0,plankHold);
                							  b[y][x].setIcon(plank2);
                						  }
                						  if(b[0][x].getIcon().equals(stump1_man) || b[0][x].getIcon().equals(stump1_man) || b[0][x].getIcon().equals(stump1_man))
                						  {
                                plankHold--;
                                plankHold = Math.max(0,plankHold);
                							  b[y][x].setIcon(plank1);
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
    Board board = new Board();
    board.getWindow().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    board.getWindow().setTitle("River Crossing Puzzle");

    board.getWindow().setSize(310, 500);
    board.getWindow().setResizable(false);

    board.getWindow().setContentPane(board.getMainPanel());
    board.getWindow().setVisible(true);

    JOptionPane.showMessageDialog(board.getWindow(),"Welcome to the River Puzzle Game!");
    JOptionPane.showMessageDialog(board.getWindow(),"The Rules are simple: You need to move from one part of the board to the other by only walking via planks and stumps");
    JOptionPane.showMessageDialog(board.getWindow(),"Press the LMB to walk, RMB to remove planks and MWB to place planks. Good Luck!");

    board.mouseClicked();
    while(true)
    {
      board.playing();
      board.changeLevel();
    }
  }
}
