import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxEx extends JFrame {

  private String fruits[] = {
    "apple",
    "banana",
    "kiwi",
    "oragnge",
    "melon",
    "apple",
    "banana",
    "kiwi",
    "oragnge",
    "melon",
  };
  private ImageIcon images[] = {
    new ImageIcon("images/heart.png"),
    new ImageIcon("images/heart.png"),
    new ImageIcon("images/heart.png"),
    new ImageIcon("images/heart.png"),
  };

  public JComboBoxEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JComboBox<String> strComboBox = new JComboBox<>(fruits); //Vector
    contentPane.add(new JScrollPane(strComboBox));

    this.setSize(300, 500);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    new JComboBoxEx();
  }
}
