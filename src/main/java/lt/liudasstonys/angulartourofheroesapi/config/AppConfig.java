package lt.liudasstonys.angulartourofheroesapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicLong;

@Configuration
public class AppConfig {

    @Bean
    public AtomicLong counter() {
        return new AtomicLong();
    }
}
