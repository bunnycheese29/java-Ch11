import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class AnimalCrossing extends JFrame {

  private int current = 2;

  public AnimalCrossing() {
    this.setTitle("동물의 숲 이상형 월드컵");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new BorderLayout());

    JLabel title = new JLabel("동물의 숲 이상형 월드컵 16강");
    title.setFont(new Font("나눔스퀘어", Font.BOLD, 24));
    title.setHorizontalAlignment(JLabel.CENTER);

    String animalList[] = {
      "다람.jpg",
      "레베카.jpg",
      "릴리안.jpg",
      "미애.jpg",
      "미첼.jpg",
      "뽀야미.jpg",
      "실바나.jpg",
      "애플.jpg",
      "여울.jpg",
      "예링.jpg",
      "쭈니.jpg",
      "찰스.jpg",
      "초코.jpg",
      "크리스틴.jpg",
      "프랑소와.jpg",
      "핑키.jpg",
    };
    String animalName[] = {
      "다람",
      "레베카",
      "릴리안",
      "미애",
      "미첼",
      "뽀야미",
      "실바나",
      "애플",
      "여울",
      "예링",
      "쭈니",
      "찰스",
      "초코",
      "크리스틴",
      "프랑소와",
      "핑키",
    };

    //메인 패널 안에 좌우 패널
    JPanel mainPanel = new JPanel();
    JPanel leftPanel = new JPanel();
    JPanel rightPanel = new JPanel();

    JLabel leftTitleLabel = new JLabel("다람");
    leftTitleLabel.setFont(new Font("나눔스퀘어", Font.BOLD, 18));

    JLabel rightTitleLabel = new JLabel("레베카");
    rightTitleLabel.setFont(new Font("나눔스퀘어", Font.BOLD, 18));
    JLabel leftLabel = new JLabel(
      new ImageIcon("images/animalCrossing/다람.jpg")
    );
    JLabel rightLabel = new JLabel(
      new ImageIcon("images/animalCrossing/레베카.jpg")
    );

    leftPanel.setLayout(new BorderLayout());
    leftPanel.add(leftLabel, BorderLayout.NORTH);
    leftPanel.add(leftTitleLabel, BorderLayout.SOUTH);
    leftTitleLabel.setHorizontalAlignment(JLabel.CENTER);

    rightPanel.setLayout(new BorderLayout());
    rightPanel.add(rightLabel, BorderLayout.NORTH);
    rightPanel.add(rightTitleLabel, BorderLayout.SOUTH);
    rightTitleLabel.setHorizontalAlignment(JLabel.CENTER);

    mainPanel.add(leftPanel);
    mainPanel.add(rightPanel);

    leftLabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          rightLabel.setIcon(
            new ImageIcon("images/animalCrossing/" + animalList[current])
          );
          rightTitleLabel.setText(animalName[current]);
          current++;
          if (current >= 16) {
            rightPanel.setVisible(false);
            leftPanel.removeMouseListener(this);
            title.setText(
              "당신의 최애 동물의숲 주민은 " +
              leftTitleLabel.getText() +
              " 입니다!"
            );
          }
        }
      }
    );
    rightLabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          leftLabel.setIcon(
            new ImageIcon("images/animalCrossing/" + animalList[current])
          );
          leftTitleLabel.setText(animalName[current]);
          current++;
          if (current >= 16) {
            leftPanel.setVisible(false);
            rightPanel.removeMouseListener(this);
            title.setText(
              "당신의 최애 동물의숲 주민은 " +
              rightTitleLabel.getText() +
              " 입니다!"
            );
          }
        }
      }
    );

    contentPane.add(title, BorderLayout.NORTH);
    contentPane.add(mainPanel, BorderLayout.CENTER);

    this.setSize(800, 800);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    new AnimalCrossing();
  }
}
