package ua.goit.service.commands.project;

import ua.goit.model.Project;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class DeleteByIdProjectCommand extends CrudCommand {

    public DeleteByIdProjectCommand(View view, Map<String, Command> commands) {
        super(view, commands, Project.class);
    }

    @Override
    public void process() {
        super.deleteById();
    }

    @Override
    public String commandName() {
        return "delete_by_id_project";
    }

    @Override
    public String description() {
        return "delete project by ID";
    }
}
