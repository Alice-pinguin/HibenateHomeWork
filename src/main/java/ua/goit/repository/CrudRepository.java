package ua.goit.repository;

import java.util.List;
import java.util.Optional;
import ua.goit.model.BaseEntity;

public interface CrudRepository<E extends BaseEntity<ID>, ID> {

    List<E> saveAll(Iterable<E> itrb); 
    
    E save(E e); 

    //E create (E e);

    //E update (E e);
    
    void deleteById(ID id);

    Optional<E> findById(ID id);
    
    List<E> findAll();
    
    
    void close();

}
