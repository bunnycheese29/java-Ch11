package practice;

import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class Practice01 extends JFrame {

  public Practice01() {
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    JCheckBox box01 = new JCheckBox("버튼 비활성화");
    JCheckBox box02 = new JCheckBox("버튼 감추기");
    JButton btn = new JButton("test button");

    box01.addItemListener(
      new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange() == ItemEvent.SELECTED) {
            btn.setEnabled(false);
          } else {
            btn.setEnabled(true);
          }
        }
      }
    );
    box02.addItemListener(
      new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange() == ItemEvent.SELECTED) {
            btn.setVisible(false);
          } else {
            btn.setVisible(true);
          }
        }
      }
    );

    contentPane.add(box01);
    contentPane.add(box02);
    contentPane.add(btn);

    this.setSize(300, 300);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
