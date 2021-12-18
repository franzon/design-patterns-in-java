package behavioral.command;

public class Light {
    private static final int MIN_BRIGHT = 0;
    private static final int MAX_BRIGHT = 10;

    private int bright = MIN_BRIGHT;

    public void turnOn() {
        bright = MAX_BRIGHT;
    }

    public void turnOff() {
        bright = MIN_BRIGHT;
    }

    public void increaseBright() {
        bright = Math.min(MAX_BRIGHT, bright + 1);
    }

    public void decreaseBright() {
        bright = Math.max(MIN_BRIGHT, bright - 1);
    }

    public int getBright() {
        return bright;
    }
}
