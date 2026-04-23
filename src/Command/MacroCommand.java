package Command;


import java.util.Stack;

public class MacroCommand implements Command {
    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        System.out.println("--- Kích hoạt kịch bản ---");
        for (Command cmd : commands) {
            cmd.execute();
        }
    }

    @Override
    public void undo() {
        System.out.println("--- Đang hoàn tác kịch bản ---");
        // Undo theo thứ tự ngược lại để đảm bảo an toàn
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}