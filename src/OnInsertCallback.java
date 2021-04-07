import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class OnInsertCallback implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        onInsert(Integer.parseInt(e.getActionCommand()));
    }

    public abstract void onInsert(int column);

}
