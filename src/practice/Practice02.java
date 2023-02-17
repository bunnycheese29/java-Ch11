package practice;

import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class Practice02 extends JFrame {

  private JComboBox<String> combo = new JComboBox<>();
  private JTextField tf = new JTextField(10);

  public Practice02() {
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    contentPane.add(tf);
    contentPane.add(new JScrollPane(combo));

    tf.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          combo.addItem(tf.getText());
          tf.setText("");
        }
      }
    );

    this.setSize(300, 300);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
