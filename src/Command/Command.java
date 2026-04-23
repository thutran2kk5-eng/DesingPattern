package Command;


public interface Command {
    void execute(); // Thực thi hành động
    void undo();    // Hoàn tác hành động
}