package Assignment4.State;

public class StoppedState implements PlayerState {
    private final Player mediaPlayer;

    public StoppedState(Player mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("Beginning playback from the start.");
        mediaPlayer.changeState(mediaPlayer.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("Cannot pause. The player is stopped.");
    }

    @Override
    public void stop() {
        System.out.println("Already stopped.");
    }
}

