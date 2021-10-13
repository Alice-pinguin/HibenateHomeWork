package ua.goit.service.commands.customer;

import ua.goit.model.Customer;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindAllCustomerCommand extends CrudCommand {

    public FindAllCustomerCommand(View view, Map<String, Command> commands) {
        super(view, commands, Customer.class);
    }

    @Override
    public void process() {
        super.findAll();
    }

    @Override
    public String commandName() {
        return "find all customer";
    }

    @Override
    public String description() {
        return "list all customers";
    }
}
