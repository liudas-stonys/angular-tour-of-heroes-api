package lt.liudasstonys.angulartourofheroesapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class App {

    public static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);

        logger.error("Loading beans...");
        Arrays.stream(ctx.getBeanDefinitionNames()).sorted().forEach(logger::error);
    }
}
