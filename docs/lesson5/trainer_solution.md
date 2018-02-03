# Trainer Class Solution

```java
class Trainer {
    // attributes, constructor and get methods here

    void capture(Pokemon pokemon) {
        numberOfPokeBalls = numberOfPokeBalls - 1;
        ownedPokemon.add(pokemon);
    }

    void choosePokemon(Integer id) {
        if (id >= 0 && id < ownedPokemon.size()) {
            return ownedPokemon.get(id);
        } else {
            System.out.println("Invalid ID. The first Pokemon will be chosen!");
            return ownedPokemon.get(0);
        }
    }

    void setStarterPokemon(Pokemon pokemon) {

    }
}
```
