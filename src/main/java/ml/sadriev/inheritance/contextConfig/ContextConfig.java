package ml.sadriev.inheritance.contextConfig;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ml.sadriev.inheritance")
public class ContextConfig {

    private static final String ML_SADRIEV_HIBERNATE = "ml.sadriev.hibernate";

/*    @Bean
    public EntityManagerFactory emFactory() {
        return Persistence.createEntityManagerFactory(ML_SADRIEV_HIBERNATE);
    }*/
}
