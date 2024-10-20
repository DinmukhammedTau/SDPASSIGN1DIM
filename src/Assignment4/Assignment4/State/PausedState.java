package Assignment4.State;

public class PausedState implements PlayerState {
    private final Player mediaPlayer;

    public PausedState(Player mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("Resuming playback.");
        mediaPlayer.changeState(mediaPlayer.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("Already paused.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping from paused state.");
        mediaPlayer.changeState(mediaPlayer.getStoppedState());
    }
}

