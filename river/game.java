import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {
  public static void main(String[] args) {
    Board board = new Board();
    board.getWindow().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    board.getWindow().setTitle("River Crossing Puzzle");

    board.getWindow().setSize(310, 500);
    board.getWindow().setResizable(false);

    board.getWindow().setContentPane(board.getMainPanel());
    board.getWindow().setVisible(true);

    board.mouseClicked();

    JOptionPane.showMessageDialog(board.getWindow(),"Welcome to the River Puzzle Game!");
    JOptionPane.showMessageDialog(board.getWindow(),"The Rules are simple: You need to move from one part of the board to the other by only walking via planks and stumps");
    JOptionPane.showMessageDialog(board.getWindow(),"Press the LMB to walk, RMB to remove planks and MWB to place planks. Good Luck!");

    while(true)
    {
      board.playing();
      board.changeLevel();
    }
  }
}
