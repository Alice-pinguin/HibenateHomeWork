package ua.goit.service.commands.developers;

import lombok.Builder;
import ua.goit.model.Developer;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class SaveDeveloperCommand extends CrudCommand {

    public SaveDeveloperCommand(View view, Map<String, Command> commands) {
        super (view, commands, Developer.class);
    }

    @Override
    public void process() {
        Developer developer = Developer.builder ()
                .name (view.read ())
                .age (Integer.valueOf (view.read ()))
                .gender (view.read ())
                .salary (Long.valueOf (view.read ()))
                .build ();

        super.save (developer);
    }

    @Override
    public String commandName() {
        return "save_new_developer";
    }

    @Override
    public String description() {
        return "for saving new developer enter: name, age, gender, salary";
    }
}
