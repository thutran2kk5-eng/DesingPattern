package Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TrafficBoard implements PropertyChangeListener {
    private String boardName;

    public TrafficBoard(String boardName) {
        this.boardName = boardName;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("[" + boardName + "] cập nhật: "
                + evt.getSource().toString() + " có tình trạng giao thông mới: "
                + evt.getNewValue());
    }
}
