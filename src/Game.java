import java.awt.*;

public class Game {

    private final int xSize = 7;
    private final int ySize = 6;

    public Game() {
        GameScreen screen = new GameScreen(xSize, ySize);
        screen.highlightField(1,1, Color.black);
        screen.setOnInsertCallback(new OnInsertCallback() {
            @Override
            public void onInsert(int column) {
                System.out.println(column);
            }
        });
    }
}
