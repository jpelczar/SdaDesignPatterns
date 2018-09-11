package io.jpelczar.behavioral.command;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Switch {
    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command command) {
        history.add(command);
        command.execute();
    }

    public void printHistory() {
        history.forEach(out::println);
    }
}
