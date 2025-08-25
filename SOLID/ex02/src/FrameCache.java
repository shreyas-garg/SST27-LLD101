public class FrameCache {
    private Frame last;

    public void cache(Frame frame) {
        last = frame;
    }

    public boolean isCached() {
        return last != null;
    }
}