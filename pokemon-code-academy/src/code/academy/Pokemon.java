package code.academy;

public class Pokemon {

    private String name = "Missingno";
    private Integer healthPoints = 20;
    private Integer combatPower = 8;

    String getName() {
        return name;
    }

    Integer getHealthPoints() {
        return healthPoints;
    }

    Integer getCombatPower() {
        return combatPower;
    }


    public void reduceHealth(Integer points) {
        if (healthPoints >= points) {
            healthPoints = healthPoints - points;
        } else {
            healthPoints = 0;
        }
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.reduceHealth(13);
        System.out.println("Remaining healthPoints: " + pikachu.healthPoints);
    }

    /**
     * Prints out information about the Pokemon in a nice way
     *
     * @return
     */
    public String toString() {
        //TODO WEEK 4
        return "Empty String";
    }

}
