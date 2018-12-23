package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author David Mojicevic on 12/23/18.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
