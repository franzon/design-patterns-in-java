package behavioral.command.commands;

import behavioral.command.Command;
import behavioral.command.Light;

public class DecreaseLightBrightCommand implements Command {
    private final Light light;

    public DecreaseLightBrightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.decreaseBright();
    }

    @Override
    public void unexecute() {
        light.increaseBright();
    }
}
