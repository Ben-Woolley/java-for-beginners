package code.academy;

public enum PokemonType {
    CHARMANDER("Charmander", 18, 5),
    SQUIRTLE("Squirtle", 22, 4),
    BULBASAUR("Bulbasaur", 15, 7),
    PIDGEY("Pidgey", 30, 12),
    CATERPIE("Caterpie", 50, 30),
    MAGIKARP("Magikarp", 27, 8),
    DITTO("Ditto", 25, 10),
    SNORLAX("Snorlax", 15, 5);

    private String name;
    private Integer healthPoints;
    private Integer combatPower;

    PokemonType(String name, Integer healthPoints, Integer combatPower) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.combatPower = combatPower;
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

    /**
     * Prints out information about the Pokemon in a nice way
     */
    public String toString() {
        return "Pokemon{" + "name='" + name + '\'' + ", healthPoints=" + healthPoints + ", combatPower=" + combatPower + '}';
    }
}
