package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * @author David Mojicevic on 12/6/18.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
