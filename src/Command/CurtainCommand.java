package Command;


public class CurtainCommand implements Command {
    private Curtain curtain;
    private int prevPosition;
    private int newPosition;

    public CurtainCommand(Curtain curtain, int position) {
        this.curtain = curtain;
        this.newPosition = position;
    }

    @Override
    public void execute() {
        prevPosition = curtain.getPosition();
        curtain.setPosition(newPosition);
    }

    @Override
    public void undo() {
        curtain.setPosition(prevPosition);
    }
}