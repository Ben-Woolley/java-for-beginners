package code.academy;

import java.util.ArrayList;
import java.util.List;

public enum PokemonType {
    CHARMANDER("Charmander", 18, 5, true),
    SQUIRTLE("Squirtle", 22, 4, true),
    BULBASAUR("Bulbasaur", 15, 7, true),
    PIDGEY("Pidgey", 30, 12),
    CATERPIE("Caterpie", 50, 30),
    MAGIKARP("Magikarp", 27, 8),
    DITTO("Ditto", 25, 10),
    SNORLAX("Snorlax", 15, 5);

    private String name;
    private Integer healthPoints;
    private Integer combatPower;
    private Boolean isStarterPokemon;

    PokemonType(String name, Integer healthPoints, Integer combatPower, Boolean isStarterPokemon) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.combatPower = combatPower;
        this.isStarterPokemon = isStarterPokemon;
    }

    PokemonType(String name, Integer healthPoints, Integer combatPower) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.combatPower = combatPower;
        this.isStarterPokemon = false;
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

    public Boolean isStarterPokemon() {
        return isStarterPokemon;
    }

    /**
     * Prints out information about the Pokemon in a nice way
     */
    public String toString() {
        return "Pokemon{" + "name='" + name + '\'' + ", healthPoints=" + healthPoints + ", combatPower=" + combatPower + '}';
    }

    public static List<PokemonType> getStarterPokemonTypes() {
        List<PokemonType> starterPokemonTypes = new ArrayList<>();
        for (PokemonType pokemonType : PokemonType.values()) {
            if (pokemonType.isStarterPokemon()) {
                starterPokemonTypes.add(pokemonType);
            }
        }
        return starterPokemonTypes;
    }

    public static List<PokemonType> getWildPokemonTypes() {
        List<PokemonType> wildPokemonTypes = new ArrayList<>();
        for (PokemonType pokemonType : PokemonType.values()) {
            if (!pokemonType.isStarterPokemon()) {
                wildPokemonTypes.add(pokemonType);
            }
        }
        return wildPokemonTypes;
    }
}
