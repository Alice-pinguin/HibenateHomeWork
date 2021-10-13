package ua.goit.service.commands.company;

import ua.goit.model.Company;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class SaveCompanyCommand extends CrudCommand {

    public SaveCompanyCommand(View view, Map<String, Command> commands) {
        super(view, commands, Company.class);
    }

    @Override
    public void process() {
        Company company = Company.builder()
                .name(view.read())
                .city(view.read())
                .build();

        super.save(company);
    }

    @Override
    public String commandName() {
        return "save_new_company";
    }

    @Override
    public String description() {
        return "for saving new company enter: name, city ";
    }
}
