package ml.sadriev.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Сотрудник extends Человек {

    @Id
    @GeneratedValue
    private long id;

    private String company;

    private long salary;
}
