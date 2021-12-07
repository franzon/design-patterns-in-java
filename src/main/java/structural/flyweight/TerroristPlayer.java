package structural.flyweight;

class TerroristPlayer implements PlayerModel {

    @Override
    public void speak(String text) {
        System.out.println("Terrorist: " + text);
    }

    @Override
    public byte[] getSprite() {
        return new byte[0];
    }
}
