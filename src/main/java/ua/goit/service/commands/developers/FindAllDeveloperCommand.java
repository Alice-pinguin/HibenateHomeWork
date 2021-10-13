package ua.goit.service.commands.developers;

import ua.goit.model.Developer;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindAllDeveloperCommand extends CrudCommand {


    public FindAllDeveloperCommand(View view, Map<String, Command> commands) {
        super(view, commands, Developer.class);
    }

    @Override
    public void process() {
        super.findAll();
    }

    @Override
    public String commandName() {
        return "find_all_developers";
    }

    @Override
    public String description() {
        return "список всех разработчиков";
    }
}
