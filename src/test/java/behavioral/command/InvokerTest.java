package behavioral.command;

import behavioral.command.commands.DecreaseLightBrightCommand;
import behavioral.command.commands.IncreaseLightBrightCommand;
import behavioral.command.commands.TurnLightOffCommand;
import behavioral.command.commands.TurnLightOnCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvokerTest {

    @Test
    void shouldInvokeCommands() {
        Light light = new Light();

        Command turnOn = new TurnLightOnCommand(light);
        Command turnOff = new TurnLightOffCommand(light);
        Command increaseBright = new IncreaseLightBrightCommand(light);
        Command decreaseBright = new DecreaseLightBrightCommand(light);

        Invoker invoker = new Invoker(turnOn, turnOff, increaseBright, decreaseBright);

        invoker.clickOn();
        assertEquals(10, light.getBright());

        invoker.clickDown();
        invoker.clickDown();
        assertEquals(8, light.getBright());

        invoker.clickUp();
        assertEquals(9, light.getBright());

        invoker.clickOff();
        assertEquals(0, light.getBright());
    }
}
