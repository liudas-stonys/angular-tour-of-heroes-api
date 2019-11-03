package lt.liudasstonys.angulartourofheroesapi;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@Getter // NOT WORKING!!!
public class App {

    // TODO: Initializes ctx before Spring Boot! :D
    // private static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    // TODO: Add getter ???
    public static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);

        logger.warn("Loading beans...");
        Arrays.stream(ctx.getBeanDefinitionNames()).sorted().forEach(logger::warn);
    }
}
