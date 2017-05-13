import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {
  public static void main(String[] args) {
    JFrame window = new JFrame();
    Board board = new Board();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setTitle("River Crossing Puzzle");
    window.setSize(400, 600);
    //window.setSize(288, 416);
    window.setResizable(true);

    window.setContentPane(board.getMainPanel());
    window.setVisible(true);

      board.mouseClicked();
  }
}
