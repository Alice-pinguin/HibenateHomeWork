package ua.goit.service.commands.project;

import ua.goit.model.Project;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class SaveProjectCommand extends CrudCommand {

    public SaveProjectCommand(View view, Map<String, Command> commands) {
        super(view, commands, Project.class);
    }

    @Override
    public void process() {
        Project project = Project.builder()
                .name(view.read())
                .cost(Long.valueOf(view.read()))
                .build();

        super.save(project);
    }

    @Override
    public String commandName() {
        return "save_new_project";
    }

    @Override
    public String description() {
        return "For saving a new project, please enter the name and cost";
    }
}
