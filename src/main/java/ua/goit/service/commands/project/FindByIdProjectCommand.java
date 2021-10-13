package ua.goit.service.commands.project;

import ua.goit.model.Project;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindByIdProjectCommand extends CrudCommand {

    public FindByIdProjectCommand(View view, Map<String, Command> commands) {
        super(view, commands, Project.class);
    }

    @Override
    public void process() {
        super.findById();
    }

    @Override
    public String commandName() {
        return "find_by_id_project";
    }

    @Override
    public String description() {
        return "find project by ID";
    }
}
