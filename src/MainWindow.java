import javax.swing.*;
import java.awt.*;

public class MainWindow {
    private JFrame window;

    public MainWindow() {
        start();
    }

    private void start() {
        window = new JFrame();
        window.setTitle("SNAKE '98");
        window.setLayout(new BorderLayout(10, 15));
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setSize(400, 400);
        window.setResizable(false);


        // game play panel
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        window.add(gamePanel, BorderLayout.CENTER);
        gamePanel.setBackground(Color.BLUE);

    }

    public void show() {
        window.setVisible(true);
    }

}
