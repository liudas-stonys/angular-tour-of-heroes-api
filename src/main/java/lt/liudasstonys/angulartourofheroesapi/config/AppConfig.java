package lt.liudasstonys.angulartourofheroesapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicLong;

// https://www.codingame.com/playgrounds/2096/playing-around-with-spring-bean-configuration

@Configuration
public class AppConfig {

    // https://stackoverflow.com/questions/9749746/what-is-the-difference-between-atomic-volatile-synchronized
    @Bean
    public AtomicLong atomicCounter() {
        return new AtomicLong();
    }
}
