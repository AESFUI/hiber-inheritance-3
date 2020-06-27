package ml.sadriev.inheritance.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import java.sql.Date;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Человек {

    @Id
    @GeneratedValue
    protected long id;

    protected String name;

    protected char gender;

    protected Date birthdate;
}
