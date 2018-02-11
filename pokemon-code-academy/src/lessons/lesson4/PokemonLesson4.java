package lessons.lesson4;

public class PokemonLesson4 {

    private String name = "Missingno";
    private Integer healthPoints = 20;
    private Integer combatPower = 8;

    public PokemonLesson4(String name, Integer healthPoints, Integer combatPower) {
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
    public String toString() {
        return this.getName() + " [HP: " + this.getHealthPoints() + "][CP: " + this.getCombatPower() + "]";
    }

    public static void main(String[] args) {
        PokemonLesson4 pikachu = new PokemonLesson4("Pikachu", 12, 5);
        pikachu.reduceHealth(13);
        System.out.println("Remaining healthPoints: " + pikachu.healthPoints);
        System.out.println(pikachu.toString());
    }
}
