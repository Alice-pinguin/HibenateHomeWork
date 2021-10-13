package ua.goit.service.commands.customer;

import ua.goit.model.Customer;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindByIdCustomerCommand extends CrudCommand {

    public FindByIdCustomerCommand(View view, Map<String, Command> commands) {
        super(view, commands, Customer.class);
    }

    @Override
    public void process() {
        super.findById();
    }

    @Override
    public String commandName() {
        return "find_by_id_customer";
    }

    @Override
    public String description() {
        return "find customer by ID";
    }
}
