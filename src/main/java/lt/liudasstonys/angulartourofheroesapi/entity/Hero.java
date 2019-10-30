package lt.liudasstonys.angulartourofheroesapi.entity;

import lombok.Data;
import lombok.NonNull;

import java.util.concurrent.atomic.AtomicLong;

@Data
public class Hero {
    public static AtomicLong counter = new AtomicLong();
    private final Long id;
    @NonNull
    private String name;
}
