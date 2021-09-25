package homework.adapter;

public class TrackAdapter implements Cars {
    private final Track track;

    TrackAdapter(Track track) {
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}
