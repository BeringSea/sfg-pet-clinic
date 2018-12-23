package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.stereotype.Service;

/**
 * @author David Mojicevic on 12/23/18.
 */
@Service
public interface VisitService extends CrudService<Visit, Long> {

}
