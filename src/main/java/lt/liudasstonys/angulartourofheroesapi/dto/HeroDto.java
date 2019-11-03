package lt.liudasstonys.angulartourofheroesapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true) // TODO: M U S T
@AllArgsConstructor
public class HeroDto {
    // @NonNull
    private String name;
}
