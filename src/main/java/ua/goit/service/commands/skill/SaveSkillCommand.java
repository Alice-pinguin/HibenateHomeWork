package ua.goit.service.commands.skill;

import ua.goit.model.Skill;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;
import java.util.Map;

public class SaveSkillCommand extends CrudCommand {

    public SaveSkillCommand(View view, Map<String, Command> commands) {
        super (view, commands, Skill.class);
    }

        @Override
    public String commandName() {
        return "save_skill";
    }

    @Override
    public String description() {
        return "For saving a new skill, please enter the language and the level of a skill";
    }

    @Override
    public void process() {
        Skill skill = Skill.builder()
                .language (view.read())
                .level (view.read())
                .build();
        super.save (skill);

    }
}
