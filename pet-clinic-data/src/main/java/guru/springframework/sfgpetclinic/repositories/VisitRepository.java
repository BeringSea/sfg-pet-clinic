package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author David Mojicevic on 12/23/18.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
