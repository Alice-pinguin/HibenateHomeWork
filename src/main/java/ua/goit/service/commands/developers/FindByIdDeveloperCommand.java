package ua.goit.service.commands.developers;

import ua.goit.model.Developer;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindByIdDeveloperCommand extends CrudCommand {

    public FindByIdDeveloperCommand(View view, Map<String, Command> commands) {
        super(view, commands, Developer.class);
    }

    @Override
    public void process() {
        super.findById();
    }

    @Override
    public String commandName() {
        return "find_by_id_developer";
    }

    @Override
    public String description() {
        return "find developer by ID";
    }
}
