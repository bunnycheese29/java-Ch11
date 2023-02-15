import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class DreamCar extends JFrame {

  private int current = 2;

  public DreamCar() {
    this.setTitle("자동차 이상형 월드컵");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new BorderLayout());

    JLabel title = new JLabel("자동차 이상형 월드컵 16강");
    title.setFont(new Font("나눔스퀘어", Font.BOLD, 24));
    title.setHorizontalAlignment(JLabel.CENTER);

    String carList[] = {
      "car01.png",
      "car02.png",
      "car03.png",
      "car04.png",
      "car05.png",
      "car06.png",
      "car07.png",
      "car08.png",
      "car09.png",
      "car10.png",
      "car11.png",
      "car12.png",
      "car13.png",
      "car14.png",
      "car15.png",
      "car16.png",
    };

    JPanel mainPanel = new JPanel();
    JLabel leftLabel = new JLabel(new ImageIcon("images/car/car01.png"));
    JLabel carLabel = new JLabel(carList[current]);
    mainPanel.add(carLabel);

    JLabel vs = new JLabel("VS");
    vs.setFont(new Font("나눔스퀘어", Font.BOLD, 24));
    JLabel rightLabel = new JLabel(new ImageIcon("images/car/car02.png"));
    JPanel resultPanel = new JPanel();
    JLabel resultLabel = new JLabel();
    resultLabel.setFont(new Font("나눔스퀘어", Font.BOLD, 16));
    resultLabel.setHorizontalAlignment(JLabel.CENTER);

    leftLabel.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
          rightLabel.setIcon(new ImageIcon("images/car/" + carList[current]));
          current++;
          if (current == 16) {
            rightLabel.setVisible(false);
            leftLabel.setHorizontalAlignment(JLabel.CENTER);
            leftLabel.setVerticalAlignment(JLabel.CENTER);
            resultLabel.setText("당신의 드림카 입니다!");
          }
        }
      }
    );
    rightLabel.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
          leftLabel.setIcon(new ImageIcon("images/car/" + carList[current]));
          current++;
          if (current == 16) {
            leftLabel.setVisible(false);
            rightLabel.setHorizontalAlignment(JLabel.CENTER);
            rightLabel.setVerticalAlignment(JLabel.CENTER);
            resultLabel.setText("당신의 드림카 입니다!");
          }
        }
      }
    );

    mainPanel.add(rightLabel);

    mainPanel.add(vs);
    mainPanel.add(leftLabel);
    resultPanel.add(resultLabel);

    contentPane.add(title, BorderLayout.NORTH);
    contentPane.add(mainPanel, BorderLayout.CENTER);
    contentPane.add(resultPanel, BorderLayout.SOUTH);

    this.setSize(800, 350);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new DreamCar();
  }
}
