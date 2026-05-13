package State;

public class Main {

    public static void main(String[] args) {

        MediaPlayer player = new MediaPlayer();

        player.showIcon();

        player.play();
        player.showIcon();

        player.pause();
        player.showIcon();
    }
}