package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author David Mojicevic on 12/23/18.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
