import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameScreen {

    private final int xSize;
    private final int ySize;

    private final JLabel[][] slots;
    private final JButton[] buttons;

    public GameScreen(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;

        JFrame frame = new JFrame();

        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(new GridLayout(xSize, ySize + 1));

        slots = new JLabel[xSize][ySize];
        buttons = new JButton[xSize];

        insertButtons(panel, buttons);
        insertRows(panel, slots);
        showFrame(frame, panel);
    }

    private void insertButtons(JPanel panel, JButton[] buttons) {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + (i + 1));
            buttons[i].setActionCommand("" + i);
            panel.add(buttons[i]);
        }
    }

    private void insertRows(JPanel panel, JLabel[][] slots) {
        for (int column = 0; column < ySize; column++) {
            for (int row = 0; row < xSize; row++) {
                slots[row][column] = new JLabel();
                slots[row][column].setHorizontalAlignment(SwingConstants.CENTER);
                slots[row][column].setBorder(new LineBorder(Color.black));
                panel.add(slots[row][column]);
            }
        }
    }

    private void showFrame(JFrame frame, JPanel panel) {
        frame.setContentPane(panel);
        frame.setSize(
                700, 600);
        frame.setVisible(
                true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void highlightField(int row, int column, Color color) {
        slots[row][column].setOpaque(true);
        slots[row][column].setBackground(color);
    }

    public void setOnInsertCallback(OnInsertCallback callback) {
        for (JButton button:buttons) {
            button.addActionListener(callback);
        }
    }

}
