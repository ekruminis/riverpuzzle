import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {
  public static void main(String[] args) {
    Board board = new Board();
    board.getWindow().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    board.getWindow().setTitle("River Crossing Puzzle");
    board.getWindow().setSize(400, 600);
    //window.setSize(288, 416);
    board.getWindow().setResizable(true);

    board.getWindow().setContentPane(board.getMainPanel());
    board.getWindow().setVisible(true);

    board.mouseClicked();
    while(true)
    {
      board.playing();
    }
  }
}
