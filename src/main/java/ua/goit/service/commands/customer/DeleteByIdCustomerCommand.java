package ua.goit.service.commands.customer;

import ua.goit.model.Customer;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class DeleteByIdCustomerCommand extends CrudCommand {

    public DeleteByIdCustomerCommand(View view, Map<String, Command> commands) {
        super(view, commands, Customer.class);
    }

    @Override
    public void process() {
        super.deleteById();
    }

    @Override
    public String commandName() {
        return "delete_by_id_customer";
    }

    @Override
    public String description() {
        return "delete customer by ID";
    }
}
