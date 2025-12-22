import javax.swing.*;

public class GameWindow {
    private JFrame window;

    public GameWindow() {
        window = new JFrame();
        window.setTitle("SNAKE '98");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setSize(800, 500);
    }

    public void show() {
        window.setVisible(true);
    }

}
