import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * This is a simple River Plank Puzzle Game implemented with Swing components.
 * Uses the Board class which contains in it the logic/graphical output of the game.
 *
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
 * @author Edvinas Kruminis (e.kruminis@lancaster.ac.uk)
 */

public class Game {
  public static void main(String[] args) {
    Board board = new Board();
    board.getWindow().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    board.getWindow().setTitle("River Crossing Puzzle");

    board.getWindow().setSize(310, 500);
    board.getWindow().setResizable(true);

    board.getWindow().setContentPane(board.getMainPanel());
    board.getWindow().setVisible(true);

    board.mouseClicked();

    JOptionPane.showMessageDialog(board.getWindow(),"Welcome to the River Puzzle Game!");
    JOptionPane.showMessageDialog(board.getWindow(),"The Rules are simple: You need to move from one part of the board to the other by only walking via planks and stumps");
    JOptionPane.showMessageDialog(board.getWindow(),"Press the LMB to walk, RMB to remove planks and MWB to place planks. Good Luck!");

    while(true)
    {
      board.playing();
    }
  }
}
