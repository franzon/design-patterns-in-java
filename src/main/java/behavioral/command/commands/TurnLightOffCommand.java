package behavioral.command.commands;

import behavioral.command.Command;
import behavioral.command.Light;

public class TurnLightOffCommand implements Command {
    private final Light light;

    public TurnLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void unexecute() {
        light.turnOn();
    }
}
