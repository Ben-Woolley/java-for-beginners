# Lesson 4 Homework Solution
```java
class Trainer {
    private String name;
    private Integer numberOfPokeBalls = 10;
    private List<Pokemon> ownedPokemon = new ArrayList<Pokemon>();

    Trainer(String trainerName) {
	    name = trainerName;
    }

    String getName() {
        return name;
    }

    Integer getNumberOfPokeBalls() {
        return numberOfPokeBalls;
    }

    ArrayList<Pokemon> getOwnedPokemon() {
        return ownedPokemon;
    }
}
```
