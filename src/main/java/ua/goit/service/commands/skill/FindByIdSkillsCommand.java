package ua.goit.service.commands.skill;

import ua.goit.model.Skill;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;
import java.util.Map;


public class FindByIdSkillsCommand extends CrudCommand {

    public FindByIdSkillsCommand(View view, Map<String, Command> commands) {
        super (view, commands, Skill.class);
    }

    @Override
    public String commandName() {
        return "find_by_id_skill";
    }

    @Override
    public String description() {
        return "Find a skill by ID";
    }

    @Override
    public void process() {
        super.findById ();
        }
    }
