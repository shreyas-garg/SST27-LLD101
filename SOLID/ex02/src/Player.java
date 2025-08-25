public class Player {
    private final Decoder decoder = new Decoder();
    private final PlayerUI ui = new PlayerUI();
    private final FrameCache cache = new FrameCache();

    void play(byte[] fileBytes) {
        Frame frame = decoder.decode(fileBytes);
        cache.cache(frame);
        ui.drawPlaying(fileBytes.length);
        ui.showCacheStatus(cache.isCached());
    }
}