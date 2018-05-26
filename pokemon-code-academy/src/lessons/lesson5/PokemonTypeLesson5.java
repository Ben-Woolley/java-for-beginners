package lessons.lesson5;

import code.academy.Pokemon;
import code.academy.PokemonType;

import java.util.ArrayList;
import java.util.List;

public enum PokemonTypeLesson5 {
    CHARMANDER("Charmander", 18, 5, true),
    SQUIRTLE("Squirtle", 22, 4, true),
    BULBASAUR("Bulbasaur", 15, 7, true),
    PIDGEY("Pidgey", 30, 12, false),
    CATERPIE("Caterpie", 50, 30, false),
    MAGIKARP("Magikarp", 27, 8, false),
    DITTO("Ditto", 25, 10, false),
    SNORLAX("Snorlax", 15, 5, false);

    private String name;
    private Integer healthPoints;
    private Integer combatPower;
    private Boolean starterPokemon;

    PokemonTypeLesson5(String name, Integer healthPoints, Integer combatPower, Boolean starterPokemon) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.combatPower = combatPower;
        this.starterPokemon = starterPokemon;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public Integer getCombatPower() {
        return combatPower;
    }

    public Boolean getStarterPokemon() {
        return starterPokemon;
    }

    /**
     * Prints out information about the Pokemon in a nice way
     */
    public String toString() {
        return "Type: " + name + " (HP: " + healthPoints + ")"
                + " (CP: " + combatPower + ")";
    }

    /**
     * Return the list of PokemonType that only contains starter pokemon.
     */
    public static List<PokemonTypeLesson5> getStarterPokemonTypes() {
        List<PokemonTypeLesson5> pokemonTypes = new ArrayList<>();
        for (PokemonTypeLesson5 type : PokemonTypeLesson5.values()) {
            if (type.getStarterPokemon()) {
                pokemonTypes.add(type);
            }
        }
        return pokemonTypes;
    }

    /**
     * Return the list of PokemonType that only contains wild pokemon.
     */
    public static List<PokemonTypeLesson5> getWildPokemonTypes() {
        List<PokemonTypeLesson5> pokemonTypes = new ArrayList<>();
        for (PokemonTypeLesson5 type : PokemonTypeLesson5.values()) {
            if (!type.getStarterPokemon()) {
                pokemonTypes.add(type);
            }
        }
        return pokemonTypes;
    }
}