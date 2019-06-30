import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * This is a simple River Plank Puzzle Game implemented with Swing components.
 *
 * The Board class contains all the elements necessary for the game to run, including
 * the initialisation of the board with multiple levels, mouse listeners to register
 * player movements such as mouseClicked().
 *
 * ActionListener is used for player movement, Mouse Listener for placing and removing planks..
 * Controls are as follows:
 *
 * <pre>
 *
 * -Left Mouse Button-= to move the player.
 * -Right Mouse Button-= to remove planks.
 * -Mouse Wheel Button-= to place planks.
 *
 * </pre>
 *
 * Simple example of use:
 *
 * <pre>
 *
 * Board board = new Board();
 * board.getWindow().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * board.getWindow().setTitle("River Crossing Puzzle");
 *
 * board.getWindow().setSize(310, 500);
 * board.getWindow().setResizable(false);
 *
 * board.getWindow().setContentPane(board.getMainPanel());
 * board.getWindow().setVisible(true);
 *
 * board.mouseClicked();
 *
 * while(true)
 * {
 *   board.playing();
 *   board.changeLevel();
 * }
 *
 * </pre>
 *
 * @author Edvinas Kruminis (e.kruminis@lancaster.ac.uk)
 */

public class Board extends JFrame implements ActionListener {
      public JPanel mainPanel = new JPanel();
      public JPanel gamePanel = new JPanel();
      public JPanel plankPanel = new JPanel();
      public JLabel plankLabel = new JLabel();
      public JFrame window = new JFrame();
      public JButton[][] b = new JButton[9][13];

      private ImageIcon water1 = new ImageIcon("water1.jpg");
      private ImageIcon water2 = new ImageIcon("water2.jpg");
      private ImageIcon water3 = new ImageIcon("water3.jpg");
      private ImageIcon water4 = new ImageIcon("water4.jpg");

      private ImageIcon plank1 = new ImageIcon("plank1.jpg");
      private ImageIcon plank1_man = new ImageIcon("plank1_man.jpg");
      private ImageIcon plank2 = new ImageIcon("plank2.jpg");
      private ImageIcon plank2_man = new ImageIcon("plank2_man.jpg");

      private ImageIcon stump1 = new ImageIcon("stump1.jpg");
      private ImageIcon stump1_man = new ImageIcon("stump1_man.jpg");
      private ImageIcon stump2 = new ImageIcon("stump2.jpg");
      private ImageIcon stump2_man = new ImageIcon("stump2_man.jpg");
      private ImageIcon stump3 = new ImageIcon("stump3.jpg");
      private ImageIcon stump3_man = new ImageIcon("stump3_man.jpg");

      private ImageIcon bank1 = new ImageIcon("bank1.jpg");
      private ImageIcon bank2 = new ImageIcon("bank2.jpg");
      private ImageIcon bank3 = new ImageIcon("bank3.jpg");

      private int plankHold = 0;

      private int level = 0;;

      /**
       * Initialises the board according to the layout of the first level and
       * incorporates Mouse Listener to register the players actions.
       */
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

      /**
       * Initialises the board according to the layout of the second level and
       * incorporates Mouse Listener to register the players actions.
       */
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

      /**
       * Initialises the board according to the layout of the third level and
       * incorporates Mouse Listener to register the players actions.
       */
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

      /**
       * Initialises the board according to the layout of the fourth level and
       * incorporates Mouse Listener to register the players actions.
       */
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

    /**
     * Returns the Frame in which the game will run.
     *
     * @return A Swing Frame for the game.
     */
    public JFrame getWindow()
    {
      return window;
    }

    /**
     * Returns the Panel which will contain the game and sets up a Grid Layout.
     * Also, during the first run, will set up the board according to the layout of level 1.
     *
     * @return A Swing Component containing the Panel for the Game.
     */
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

    /**
     * Returns the variable plankHold which counts the number of planks being
     * currently held by the player.
     *
     * @return Number of Planks the player currently holds
     */
    private int getPlankHold()
    {
      return plankHold;
    }

    /**
     * Returns the Panel which will display the plankHold variable and tell the player
     * how many planks they currently hold.
     *
     * @return A Swing Component informing the user of the planks he currently holds
     */
    public JComponent getPlankPanel()
    {
      plankLabel.setText("Amount of planks being currently held: " + getPlankHold());
      plankPanel.add(plankLabel);
      return plankPanel;
    }

    /**
     * Returns the Main Panel for the game, and sets up a layout which will display the plankHold
     * at the top and the game itself in the bottom/centre.
     *
     * @return A Swing Component which holds the Main Panel of the game, containing gamePanel and plankPanel.
     */
    public JComponent getMainPanel()
    {
      BorderLayout b = new BorderLayout();
      mainPanel.setLayout(b);

      mainPanel.add(getGamePanel(), b.CENTER);
      mainPanel.add(getPlankPanel(), b. NORTH);

      return mainPanel;
    }

    /**
     * Updates the board to ensure that there is only one _man at any time. Used in accordance with the
     * Action Listener which alllows for player movement.
     */
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

    /**
     * Runs constantly when the player is playing the game to ensure that the game updates
     * the number planks being held and changes the level if it finds that the current one
     * is finished.
     */
    public void playing()
    {
      plankLabel.setText("Amount of planks currently being held: " + getPlankHold());
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

    /**
     * Registers the players Left-Mouse clicks and acts accordingly, ie. moves the _man
     * to the selected location and uses the update() method to remove the _man from the
     * previous location.
     *
     * Does not allow for incorrect movement, ie. beyond/into water, etc.
     * Ensures the player can only move the _man to the location to the right, left, top or
     * bottom of the current _man's location.
     *
     * Also updates the level variable when the player reaches stump3_man which signals the
     * end of current level he/she is on.
     */
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

    /**
     * Registers the players actions with Mouse Listener concerning the placement/removal of planks.
     * Ensures that the the removal/placement of the plank can only be done when the _man
     * is on a stump, and that the planks can only be placed or removed according to the rules, ie.
     * when next to a stump the _man is on.
     *
     * Also updates the plankHold variable to correctly count the number of planks being held, and
     * ensures that the player cannot hold/remove more planks than according to the rules of the game.
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
   * @param args unused.
   */

  public static void main(String[] args)
  {
    Board board = new Board();
    board.getWindow().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    board.getWindow().setTitle("River Crossing Puzzle");

    board.getWindow().setSize(310, 500);
    board.getWindow().setResizable(true);

    board.getWindow().setContentPane(board.getMainPanel());
    board.getWindow().setVisible(true);

    JOptionPane.showMessageDialog(board.getWindow(),"Welcome to the River Puzzle Game!");
    JOptionPane.showMessageDialog(board.getWindow(),"The Rules are simple: You need to move from one part of the board to the other by only walking via planks and stumps");
    JOptionPane.showMessageDialog(board.getWindow(),"Press the LMB to walk, RMB to remove planks and MWB to place planks. Good Luck!");

    board.mouseClicked();
    while(true)
    {
      board.playing();
    }
  }
}
