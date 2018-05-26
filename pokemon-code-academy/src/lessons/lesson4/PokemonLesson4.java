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

    public String toString() {
        return name + " (HP: " + healthPoints + ")"
                + " (CP: " + combatPower + ")";
    }

    public static void main(String[] args) {
        PokemonLesson4 pikachu = new PokemonLesson4("Pikachu", 20, 10);

        System.out.println(pikachu.toString());
        pikachu.reduceHealth(10);
        System.out.println(pikachu.toString());
    }
}
