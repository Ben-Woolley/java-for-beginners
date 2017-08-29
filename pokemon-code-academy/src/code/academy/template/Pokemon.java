package code.academy.template;

public class Pokemon {

    String name = "Missingno";
    int healthPoints = 20;
    int combatPower = 8;

    String getName() {
        return name;
    }

    int getHealthPoints() {
        return healthPoints;
    }

    int getCombatPower() {
        return combatPower;
    }


    public void reduceHealth(int points) {
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
