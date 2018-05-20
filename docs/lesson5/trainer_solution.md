# Trainer Class Solution

```java
public class PokemonTrainer {
    // attributes, constructor and get methods here

    public void capture(Pokemon pokemon) {
        numberOfPokeBalls = numberOfPokeBalls - 1;
        ownedPokemon.add(pokemon);
    }

    public void choosePokemon(Integer id) {
        if (id >= 0 && id < ownedPokemon.size()) {
            return ownedPokemon.get(id);
        } else {
            System.out.println("Invalid ID. The first Pokemon will be chosen!");
            return ownedPokemon.get(0);
        }
    }

    public void setStarterPokemon(Pokemon pokemon) {

    }
}
```
