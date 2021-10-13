package ua.goit.service.commands.skill;

import ua.goit.model.Skill;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;
import java.util.Map;


public class DeleteByIdSkillCommand extends CrudCommand {

    public DeleteByIdSkillCommand(View view, Map<String, Command> commands) {
        super (view, commands, Skill.class);
    }

    @Override
    public void process() {
        super.deleteById ();
    }

    @Override
    public String commandName() {
        return "delete_skill";
}

    @Override
    public String description() {
        return "delete skill by ID";
    }
}