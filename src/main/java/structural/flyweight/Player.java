package structural.flyweight;

class Player {
    // Reference to flyweight class
    private final PlayerModel model;

    // Data that can change
    private double latitude;
    private double longitude;

    public Player(PlayerModel model) {
        this.model = model;
    }

    public void speak() {
        model.speak("I'm at " + latitude + ", " + longitude);
    }
}
