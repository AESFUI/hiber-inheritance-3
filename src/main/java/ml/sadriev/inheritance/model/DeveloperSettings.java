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
@DiscriminatorValue("DevSet")
public class DeveloperSettings extends Settings {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    private String fullName;

    private String email;

    public DeveloperSettings(String email, String fullName, String device) {
        super(device);
        this.email = email;
        this.fullName = fullName;
    }
}