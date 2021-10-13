package ua.goit.service.commands.skill;

import ua.goit.model.Skill;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindAllSkillCommand extends CrudCommand {

    public FindAllSkillCommand(View view, Map<String, Command> commands) {
        super (view, commands, Skill.class);
    }

    @Override
    public String commandName() {
        return "find_all_skills";
    }

    @Override
    public String description() {
        return "Find all data about skills";
    }

    @Override
    public void process() {
        super.findAll ();
    }
}
