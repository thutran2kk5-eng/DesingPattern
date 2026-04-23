package Command;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ControlPanel {
    private Stack<Command> history = new Stack<>(); // Dùng Stack để quản lý Undo

    public void performAction(Command command) {
        command.execute();
        history.push(command); // Lưu vào lịch sử
    }

    public void undoLastAction() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Không có hành động nào để hoàn tác.");
        }
    }
}