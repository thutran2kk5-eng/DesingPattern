package Command;

public class ProjectorCommand implements Command {
    private Projector projector;
    private String prevMode;
    private String newMode;

    public ProjectorCommand(Projector projector, String mode) {
        this.projector = projector;
        this.newMode = mode;
    }

    @Override
    public void execute() {
        prevMode = projector.getMode(); // lưu trạng thái cũ
        projector.setMode(newMode);     // đặt trạng thái mới
    }

    @Override
    public void undo() {
        projector.setMode(prevMode);    // hoàn tác về trạng thái trước đó
    }
}
