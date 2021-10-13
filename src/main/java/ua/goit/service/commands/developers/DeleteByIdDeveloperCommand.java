package ua.goit.service.commands.developers;

import ua.goit.model.Developer;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class DeleteByIdDeveloperCommand extends CrudCommand {

    public DeleteByIdDeveloperCommand(View view, Map<String, Command> commands) {
        super(view, commands, Developer.class);
    }

    @Override
    public void process() {
        super.deleteById();
    }

    @Override
    public String commandName() {
        return "delete_by_id_developer";
    }

    @Override
    public String description() {
        return "удалить разработчика по ID";
    }
}
