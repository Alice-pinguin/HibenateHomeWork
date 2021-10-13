package ua.goit.service.commands;

import lombok.RequiredArgsConstructor;
import ua.goit.view.View;

import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class HelpCommand implements Command {

    private final View view;
    private final Map<String, Command> commands;

    @Override
    public void process() {
        view.write(commands.values().stream()
                .map(command -> String.join(" - ", command.commandName(), command.description()))
                .sorted()
                .collect(Collectors.joining("\n")));
    }

    @Override
    public String commandName() {
        return "help";
    }

    @Override
    public String description() {
        return "list of all command";
    }
}
