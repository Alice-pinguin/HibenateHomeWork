package ua.goit.service.commands.customer;

import ua.goit.model.Customer;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class SaveCustomerCommand extends CrudCommand {

    public SaveCustomerCommand(View view, Map<String, Command> commands) {
        super(view, commands, Customer.class);
    }

    @Override
    public void process() {
        Customer customer = Customer.builder()
                .name(view.read())
                .industry(view.read())
                .build();

        super.save(customer);
    }

    @Override
    public String commandName() {
        return "save_new_customer";
    }

    @Override
    public String description() {
        return "for saving new customer enter: name and industry";
    }
}
