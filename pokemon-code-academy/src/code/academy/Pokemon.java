package code.academy;

import java.util.Objects;

public class Pokemon {

    private String name = "Missingno";
    private Integer healthPoints = 20;
    private Integer combatPower = 8;
    private Boolean isCaptured = false;

    public Pokemon() {
        name = "Missingno";
        healthPoints = 20;
        combatPower = 8;
    }

    public Pokemon(String pokemonName, Integer pokemonHealthPoints, Integer pokemonCombatPower) {
        name = pokemonName;
        healthPoints = pokemonHealthPoints;
        combatPower = pokemonCombatPower;
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

    public Boolean isCaptured() {
        return isCaptured;
    }

    public void setCaptured(Boolean captured)
    {
        isCaptured = captured;
    }

    public void reduceHealth(Integer points) {
        if (healthPoints >= points) {
            healthPoints = healthPoints - points;
        } else {
            healthPoints = 0;
        }
    }

    /**
     * Prints out information about the Pokemon in a nice way
     */
    public String toString()
    {
        return "Pokemon{" + "name='" + name + '\'' + ", healthPoints=" + healthPoints + ", combatPower=" + combatPower + '}';
    }

    public boolean equals(Object other) {
        if (other.getClass() != Pokemon.class) return false;
        Pokemon otherPkmn = (Pokemon) other;
        return Objects.equals(this.name, otherPkmn.name);
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 20, 8);
        pikachu.healthPoints = 13;
        pikachu.reduceHealth(13);
        System.out.println("Remaining healthPoints: " + pikachu.healthPoints);
    }
}
