package code.academy;

public class Pokemon {

    String name;
    Integer healthPoints;
    Integer combatPower;
    Boolean isCaptured = false;

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

    String getName() {
        return name;
    }

    Integer getHealthPoints() {
        return healthPoints;
    }

    Integer getCombatPower() {
        return combatPower;
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

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 20, 8);
        pikachu.healthPoints = 13;
        pikachu.reduceHealth(13);
        System.out.println("Remaining healthPoints: " + pikachu.healthPoints);
    }

    /**
     * Prints out information about the Pokemon in a nice way
     *
     * @return
     */
    public String toString()
    {
        return "Pokemon{" + "name='" + name + '\'' + ", healthPoints=" + healthPoints + ", combatPower=" + combatPower + '}';
    }

}
