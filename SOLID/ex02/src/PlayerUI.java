public class PlayerUI {
    public void drawPlaying(int length) {
        System.out.println("\u25B6 Playing " + length + " bytes");
    }

    public void showCacheStatus(boolean cached) {
        System.out.println("Cached last frame? " + cached);
    }
}