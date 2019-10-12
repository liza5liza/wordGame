import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WordGameInterface extends JFrame {
 private JButton startButton;
    private JButton next;
    private JButton check;
    private JTextField wordField;
    private JTextField translationField;
    public WordGameInterface() throws IOException {
        setTitle("Word Game");
        BufferedImage img  = ImageIO.read(new File("src/1.png"));
        MyImagePanel panel = new MyImagePanel(img);
        panel.setLayout(null);

        wordField=new JTextField("word");
        translationField=new JTextField("слово(перевод слова)");

       wordField.setLayout(null);
       translationField.setLayout(null);

        wordField.setBounds(100,90,200,30);
        translationField.setBounds(100,130,200,30);

        wordField.setFont(new Font("Arial",Font.ROMAN_BASELINE,16));
        translationField.setFont(new Font("Arial",Font.ROMAN_BASELINE,16));

        startButton=new JButton("начать");

        startButton.setLayout(null);
        startButton.setBounds(100,50,200,30);
        startButton.setBackground(new Color(214, 61, 88));
        startButton.setForeground(Color.WHITE);
        startButton.setFont(new Font("Arial",Font.BOLD,26));
        startButton.setFocusPainted(false);

        setContentPane(panel);
        setSize(100,800);
        setVisible(true);

    }

    public static void main(String[] args) throws IOException {
        new WordGameInterface();
    }
}


