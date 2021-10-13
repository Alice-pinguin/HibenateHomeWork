package ua.goit.service.commands;

import ua.goit.model.BaseEntity;
import ua.goit.repository.CrudRepository;
import ua.goit.repository.RepositoryFactory;
import ua.goit.view.View;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public abstract class CrudCommand<E extends BaseEntity<ID>, ID> implements Command {

    private final CrudRepository<E, ID> crudRepository;
    private final Class<E> modelClass;
    protected final View view;
    protected final Map<String, Command> commands;

    public CrudCommand(View view, Map<String, Command> commands, Class<E> modelClass) {
        this.view = view;
        this.modelClass = modelClass;
        this.crudRepository = RepositoryFactory.of (modelClass);
        this.commands = commands;
    }

    protected void findAll() {
        List<E> result = crudRepository.findAll ();
        sendResult (!result.isEmpty (), result);
    }

    protected void findById() {
        view.write ("Enter ID");
        Long id = Long.valueOf (view.read ());
        Optional<E> result = crudRepository.findById ((ID) id);
        sendResult (result.isPresent (), result);
    }

    protected void deleteById() {
        view.write ("Enter ID entity");
        Long id = Long.valueOf (view.read ());
        crudRepository.deleteById ((ID) id);
        view.write ("Entity with ID: " + view.read () + " deleted");
    }

    protected void save(E entity) {
        view.write ("You saved - " + entity);
        crudRepository.save (entity);
    }


    private void sendResult(Boolean isDone, Object... result) {
        if (isDone) view.write (result);
        else view.write ("Sorry, for your request doesn't find any entity");
    }

}
