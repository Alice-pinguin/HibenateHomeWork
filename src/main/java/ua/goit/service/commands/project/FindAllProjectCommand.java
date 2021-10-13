package ua.goit.service.commands.project;

import ua.goit.model.Project;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindAllProjectCommand extends CrudCommand {

    public FindAllProjectCommand(View view, Map<String, Command> commands) {
        super(view, commands, Project.class);
    }

    @Override
    public void process() {
        super.findAll();
    }

    @Override
    public String commandName() {
        return "find_all_project";
    }

    @Override
    public String description() {
        return "list of all project";
    }
}
