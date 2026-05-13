package State;

public class PausedState implements State {

    @Override
    public void play(MediaPlayer player) {

        System.out.println("Music Playing");

        player.setState(new PlayingState());
        player.setIcon("Pause Icon");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already Paused");
    }
}