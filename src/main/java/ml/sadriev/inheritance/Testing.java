package ml.sadriev.inheritance;

import lombok.SneakyThrows;
import ml.sadriev.inheritance.model.ApplicationSettings;
import ml.sadriev.inheritance.model.DeveloperSettings;
import ml.sadriev.inheritance.model.Settings;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class Testing {

    private static final EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("ml.sadriev.hibernate");
    }

    @SneakyThrows
    public void start() {
        final EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        em.persist(new Settings(true));
        em.persist(new ApplicationSettings("Windows", 1024L, true));
        em.persist(new DeveloperSettings("em@em.com", "Ivan Ivanych Ivanov", "Роутер"));

        em.getTransaction().commit();
    }
}
