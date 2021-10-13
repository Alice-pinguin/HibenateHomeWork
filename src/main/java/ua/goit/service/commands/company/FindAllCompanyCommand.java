package ua.goit.service.commands.company;

import ua.goit.model.Company;
import ua.goit.model.Developer;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindAllCompanyCommand extends CrudCommand {

    public FindAllCompanyCommand(View view, Map<String, Command> commands) {
        super(view, commands, Company.class);
    }

    @Override
    public void process() {
        super.findAll();
    }

    @Override
    public String commandName() {
        return "find_all_company";
    }

    @Override
    public String description() {
        return "list all companies";
    }
}
