package ml.sadriev.inheritance.model;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor
@Entity
@DiscriminatorColumn (name = "type", discriminatorType = DiscriminatorType.STRING)
public class Settings {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    protected String id;

    @Column(length = 15, nullable = false)
    protected String ip;

    protected boolean active;

    protected String device;

    protected int revision;

    public Settings(boolean active) {
        this.active = active;
        this.ip = "localhost";
    }

    public Settings(String device) {
        this.device = device;
        this.ip = "localhost";
    }
}
