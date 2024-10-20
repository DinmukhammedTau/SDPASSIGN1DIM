package Assignment4.State;

public class Player {
    private PlayerState currentState;
    private final PlayerState playingState;
    private final PlayerState pausedState;
    private final PlayerState stoppedState;

    public Player() {
        this.playingState = new PlayingState(this);
        this.pausedState = new PausedState(this);
        this.stoppedState = new StoppedState(this);
        this.currentState = stoppedState;
    }

    public void changeState(PlayerState newState) {
        this.currentState = newState;
    }

    public void requestPlay() {
        currentState.play();
    }

    public void requestPause() {
        currentState.pause();
    }

    public void requestStop() {
        currentState.stop();
    }

    public PlayerState getPlayingState() {
        return playingState;
    }

    public PlayerState getPausedState() {
        return pausedState;
    }

    public PlayerState getStoppedState() {
        return stoppedState;
    }
}

