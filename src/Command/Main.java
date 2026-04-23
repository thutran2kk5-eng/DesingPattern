package Command;


public class Main {
    public static void main(String[] args) {
        // Khởi tạo thiết bị
        Light mainLight = new Light();
        Curtain windowCurtain = new Curtain();
        Projector officeProjector = new Projector();
        ControlPanel panel = new ControlPanel();

        // 1. Thực hiện lệnh đơn lẻ
        System.out.println("Thao tác 1:");
        panel.performAction(new LightCommand(mainLight, 80));

        // 2. Thiết lập và chạy kịch bản "Bắt đầu họp"
        System.out.println("\nThao tác 2:");
        Command[] startMeetingSteps = {
            new CurtainCommand(windowCurtain, 100),
            new LightCommand(mainLight, 20),
            // Giả lập máy chiếu dùng Lambda cho gọn nếu muốn
            new Command() {
                String prev;
                public void execute() { prev = officeProjector.getMode(); officeProjector.setMode("Làm việc"); }
                public void undo() { officeProjector.setMode(prev); }
            }
        };
        MacroCommand startMeeting = new MacroCommand(startMeetingSteps);
        panel.performAction(startMeeting);

        // 3. Undo kịch bản vừa rồi
        System.out.println("\nNgười dùng nhấn nút Undo:");
        panel.undoLastAction();
    }
}
