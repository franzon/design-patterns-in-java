package behavioral.command.commands;

import behavioral.command.Command;
import behavioral.command.Light;

public class IncreaseLightBrightCommand implements Command {
    private final Light light;

    public IncreaseLightBrightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.increaseBright();
    }

    @Override
    public void unexecute() {
        light.decreaseBright();
    }
}
