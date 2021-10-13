package ua.goit.service.commands.company;

import ua.goit.model.Company;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindByIdCompanyCommand extends CrudCommand {

    public FindByIdCompanyCommand(View view, Map<String, Command> commands) {
        super(view, commands, Company.class);
    }

    @Override
    public void process() {
        super.findById ();
    }

    @Override
    public String commandName() {
        return "find_by_id_company";
    }

    @Override
    public String description() {
        return "find company by ID";
    }
}
