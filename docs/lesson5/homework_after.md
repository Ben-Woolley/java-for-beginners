# Lesson 4 Homework Solution
```java
class Trainer {
  String name;
  int numberOfPokeBalls = 10;
  List<Pokemon> ownedPokemon = new ArrayList<Pokemon>();

	Trainer(String trainerName) {
     name = trainerName;
	}

	String getName() {
     return name;
	}

	int getNumberOfPokeBalls() {
    return numberOfPokeBalls;
	}

	ArrayList<Pokemon> getOwnedPokemon() {
    	    return ownedPokemon;
	}
}
```
