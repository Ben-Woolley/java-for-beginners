package lessons.lesson4;

import code.academy.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokemonTrainerLesson4 {
    private String name;
    private Integer numberOfPokeballs = 10;
    private List<Pokemon> ownedPokemon = new ArrayList<>();

    public PokemonTrainerLesson4(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfPokeballs() {
        return numberOfPokeballs;
    }

    public List<Pokemon> getOwnedPokemon() {
        return ownedPokemon;
    }

    /**
     * The rest of the class has been removed in this solution class to avoid duplication.
     * Please copy/paste the above code within the class rather than replace your existing file.
     */
}
