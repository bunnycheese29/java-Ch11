import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class JButtonEx extends JFrame {

  public JButtonEx() {
    ImageIcon imgIcon = new ImageIcon("images/heart.png");
    ImageIcon imgOverIcon = new ImageIcon("images/heart (2).png");
    ImageIcon imgPressIcon = new ImageIcon("images/love.png");
    JButton btn = new JButton("button");
    JButton imgBtn = new JButton("이미지 버튼", imgIcon);
    imgBtn.setBorderPainted(false);
    imgBtn.setContentAreaFilled(false);
    imgBtn.setFocusPainted(false);

    imgBtn.setPressedIcon(imgPressIcon);
    imgBtn.setRolloverIcon(imgOverIcon);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(btn);
    contentPane.add(imgBtn);

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JButtonEx();
  }
}
