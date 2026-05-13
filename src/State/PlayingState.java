package State;

public class PlayingState implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already Playing");
    }

    @Override
    public void pause(MediaPlayer player) {

        System.out.println("Music Paused");

        player.setState(new PausedState());
        player.setIcon("Play Icon");
    }
}