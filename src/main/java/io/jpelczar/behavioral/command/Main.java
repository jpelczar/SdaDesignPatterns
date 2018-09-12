package io.jpelczar.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);

        Switch lightSwitch = new Switch();

        lightSwitch.storeAndExecute(turnOn);
        lightSwitch.storeAndExecute(turnOff);
        lightSwitch.storeAndExecute(turnOn);

        System.out.println("\nCommand history:");

        lightSwitch.printHistory();
    }
}
