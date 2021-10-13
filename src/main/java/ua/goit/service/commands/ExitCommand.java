package ua.goit.service.commands;

import ua.goit.view.View;

import java.util.Map;

public class ExitCommand implements Command{

    private final View view;

    public ExitCommand(View view, Map<String,Command> commands) {
        this.view = view;
    }

    @Override
    public void process() {
        view.write("Good luck");
        System.exit(0);
    }

    @Override
    public String commandName() {
        return "exit";
    }

    @Override
    public String description() {
        return "exit";
    }
}
