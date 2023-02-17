package practice;

import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class Practice03 extends JFrame {

  public Practice03() {
    JTextField tf = new JTextField(10);
    JTextField result[] = new JTextField[8];
    JButton btn = new JButton("계산");
    JLabel money[] = new JLabel[8];
    String str[] = {
      "오만원",
      "만원",
      "천원",
      "500원",
      "100원",
      "50원",
      "10원",
      "1원",
    };
    int won[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

    setTitle("Money Changer");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.setBackground(Color.pink);

    JPanel mPanel = new JPanel();
    mPanel.setLayout(new FlowLayout());
    mPanel.add(new JLabel("금액"));
    mPanel.add(tf);
    mPanel.add(btn);
    mPanel.setBackground(Color.pink);

    btn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          int total = Integer.parseInt(tf.getText());
          for (int i = 0; i < 8; i++) {
            result[i].setText(Integer.toString(total / won[i]));
            total %= won[i];
          }
        }
      }
    );

    JPanel sPanel = new JPanel();
    sPanel.setLayout(new GridLayout(8, 2));
    sPanel.setBackground(Color.PINK);
    for (int i = 0; i < 8; i++) {
      money[i] = new JLabel(str[i]);
      result[i] = new JTextField();
      sPanel.add(money[i]);
      sPanel.add(result[i]);
    }

    contentPane.add(sPanel, BorderLayout.SOUTH);
    contentPane.add(mPanel, BorderLayout.NORTH);
    this.setSize(300, 500);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    new Practice03();
  }
}
