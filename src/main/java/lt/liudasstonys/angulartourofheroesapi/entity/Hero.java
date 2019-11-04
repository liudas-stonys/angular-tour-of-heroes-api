package lt.liudasstonys.angulartourofheroesapi.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Hero {
    private final Long id;
    @NonNull
    private String name;
}
