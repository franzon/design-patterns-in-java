package structural.flyweight;

class CounterTerroristPlayer implements PlayerModel {

    @Override
    public void speak(String text) {
        System.out.println("Counter Terrorist: " + text);
    }

    @Override
    public byte[] getSprite() {
        return new byte[0];
    }
}
