package guru.springframework.sfgpetclinic.model;

/**
 * @author David Mojicevic on 12/6/18.
 */
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
