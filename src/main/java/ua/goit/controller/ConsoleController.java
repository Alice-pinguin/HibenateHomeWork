package ua.goit.controller;

import lombok.SneakyThrows;
import ua.goit.service.commands.Command;
import ua.goit.view.View;
import java.util.Map;
import java.util.Optional;

public class ConsoleController {

    private final View view;
    private final Map<String, Command> commands;

    @SneakyThrows
    public ConsoleController(View view) {
        this.view = view;
        this.commands = Command.of (view);
    }

    public void process() {
        view.write ("Welcome to hibernate database application");
        while (true) {
            view.write ("Enter the command or 'help' for showing all commands.");
            Optional.ofNullable (commands.get (view.read ())).ifPresent (Command::process);
        }
    }
}