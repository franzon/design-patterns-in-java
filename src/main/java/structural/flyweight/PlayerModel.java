package structural.flyweight;

// This is the flyweight
interface PlayerModel {
    void speak(String text);

    byte[] getSprite(); // Data that is big
}
