package behavioral.command;

public class Invoker {
    private final Command turnOn;
    private final Command turnOff;
    private final Command increaseBright;
    private final Command decreaseBright;

    public Invoker(Command turnOn, Command turnOff, Command increaseBright, Command decreaseBright) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
        this.increaseBright = increaseBright;
        this.decreaseBright = decreaseBright;
    }

    public void clickOn() {
        this.turnOn.execute();
    }

    public void clickOff() {
        this.turnOff.execute();
    }

    public void clickUp() {
        this.increaseBright.execute();
    }

    public void clickDown() {
        this.decreaseBright.execute();
    }

}
