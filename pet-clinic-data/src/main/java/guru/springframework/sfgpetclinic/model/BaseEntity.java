package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author David Mojicevic on 12/6/18.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
