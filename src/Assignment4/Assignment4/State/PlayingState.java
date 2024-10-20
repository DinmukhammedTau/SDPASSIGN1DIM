package Assignment4.State;

public class PlayingState implements PlayerState {
    private final Player mediaPlayer;

    public PlayingState(Player mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("Already playing....");
    }

    @Override
    public void pause() {
        System.out.println("Pause the playback.");
        mediaPlayer.changeState(mediaPlayer.getPausedState());
    }

    @Override
    public void stop() {
        System.out.println("Stopping the playback.");
        mediaPlayer.changeState(mediaPlayer.getStoppedState());
    }
}

