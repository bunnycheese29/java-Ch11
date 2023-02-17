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
    String carTitle[] = {
      "포르쉐",
      "람보르기니",
      "아이오닉",
      "빠른차",
      "더 빠른차",
      "현대",
      "기아",
      "토요타",
      "테슬라",
      "자동차",
      "쉐보레",
      "모닝",
      "g80",
      "gv70",
      "마이카",
      "너의카",
    };

    JPanel mainPanel = new JPanel();
    JPanel leftPanel = new JPanel();
    JPanel rightPanel = new JPanel();
    JLabel leftTitleLabel = new JLabel("포르쉐");
    JLabel rightTitleLabel = new JLabel("람보르기니");
    JLabel leftLabel = new JLabel(new ImageIcon("images/car/car01.png"));
    JLabel rightLabel = new JLabel(new ImageIcon("images/car/car02.png"));

    leftTitleLabel.setHorizontalAlignment(JLabel.CENTER);
    rightTitleLabel.setHorizontalAlignment(JLabel.CENTER);
    leftPanel.setLayout(new BorderLayout());
    leftPanel.add(leftLabel, BorderLayout.NORTH);
    leftPanel.add(leftTitleLabel, BorderLayout.SOUTH);

    rightPanel.setLayout(new BorderLayout());
    rightPanel.add(rightLabel, BorderLayout.NORTH);
    rightPanel.add(rightTitleLabel, BorderLayout.SOUTH);

    mainPanel.add(leftPanel);
    mainPanel.add(rightPanel);

    leftLabel.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
          rightLabel.setIcon(new ImageIcon("images/car/" + carList[current]));
          rightTitleLabel.setText(carTitle[current]);
          current++;
          if (current >= 16) {
            rightPanel.setVisible(false);
            leftLabel.removeMouseListener(this);
            leftLabel.setHorizontalAlignment(JLabel.CENTER);
            leftLabel.setVerticalAlignment(JLabel.CENTER);
            title.setText("당신의 드림카는 " + leftTitleLabel.getText());
          }
        }
      }
    );
    rightLabel.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
          leftLabel.setIcon(new ImageIcon("images/car/" + carList[current]));
          leftTitleLabel.setText(carTitle[current]);
          current++;
          if (current >= 16) {
            leftPanel.setVisible(false);
            rightLabel.removeMouseListener(this);
            rightLabel.setHorizontalAlignment(JLabel.CENTER);
            rightLabel.setVerticalAlignment(JLabel.CENTER);
            title.setText("당신의 드림카는 " + rightTitleLabel.getText());
          }
        }
      }
    );

    contentPane.add(title, BorderLayout.NORTH);
    contentPane.add(mainPanel, BorderLayout.CENTER);

    this.setSize(800, 350);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new DreamCar();
  }
}
