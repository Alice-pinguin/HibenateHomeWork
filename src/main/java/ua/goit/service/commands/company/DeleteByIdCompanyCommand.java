package ua.goit.service.commands.company;

import ua.goit.model.Company;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class DeleteByIdCompanyCommand extends CrudCommand {

    public DeleteByIdCompanyCommand(View view, Map<String, Command> commands) {
        super(view, commands, Company.class);
    }

    @Override
    public void process() {
        super.deleteById();
    }

    @Override
    public String commandName() {
        return "delete_by_id_company";
    }

    @Override
    public String description() {
        return "delete company by ID";
    }
}
