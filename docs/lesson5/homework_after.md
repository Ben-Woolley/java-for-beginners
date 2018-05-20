# Lesson 4 Homework Solution
```java
public class PokemonTrainer {
    private String name;
    private Integer numberOfPokeBalls = 10;
    private List<Pokemon> ownedPokemon = new ArrayList<Pokemon>();

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public Trainer(String trainerName) {
	    name = trainerName;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfPokeBalls() {
        return numberOfPokeBalls;
    }

    public List<Pokemon> getOwnedPokemon() {
        return ownedPokemon;
    }
}
```
