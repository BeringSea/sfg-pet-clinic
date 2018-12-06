package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * @author David Mojicevic on 12/6/18.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
