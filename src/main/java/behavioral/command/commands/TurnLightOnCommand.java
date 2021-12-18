package behavioral.command.commands;

import behavioral.command.Command;
import behavioral.command.Light;

public class TurnLightOnCommand implements Command {
    private final Light light;

    public TurnLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void unexecute() {
        light.turnOff();
    }
}
