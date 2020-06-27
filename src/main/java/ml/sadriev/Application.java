package ml.sadriev;

import ml.sadriev.inheritance.Testing;
import ml.sadriev.inheritance.contextConfig.ContextConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        Testing testing = context.getBean(Testing.class);
        testing.start();
    }
}
