package lt.liudasstonys.angulartourofheroesapi;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan @ConfigurationPropertiesScan
@Slf4j
@Getter // NOT WORKING!!!
public class App {

    // TODO: Initializes ctx before Spring Boot! :D
    // private static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    // public static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);

//        log.warn("Loading beans...");
//        Arrays.stream(ctx.getBeanDefinitionNames()).sorted().forEach(log::warn);
    }
}
