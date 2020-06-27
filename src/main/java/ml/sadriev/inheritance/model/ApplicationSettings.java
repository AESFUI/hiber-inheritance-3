package ml.sadriev.inheritance.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
@DiscriminatorValue("AppSet")
public class ApplicationSettings extends Settings {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    protected String id;

    protected String os;

    protected long memory;

    public ApplicationSettings(String os, long memory, boolean active) {
        super(active);
        this.os = os;
        this.memory = memory;
    }
}
