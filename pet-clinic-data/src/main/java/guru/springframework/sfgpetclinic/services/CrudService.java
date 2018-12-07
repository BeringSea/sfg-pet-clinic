package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * @author David Mojicevic on 12/7/18.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);


}
