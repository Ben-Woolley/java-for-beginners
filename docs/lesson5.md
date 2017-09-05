# Lesson 5 - Pokemon Code Academy part 1

## Recap: Trainer Homework
### Before
```java
class PokemonTrainer
{
  // name
  // numberOfPokeBalls - start with 10
  // list of ownedPokemon

  // constructor that takes the trainer’s name - trainerName

  // getters for all attributes of the trainer
}
```

### after
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

## Now let's add some functionality
```java
class Trainer {
  // attributes, constructor and get methods here
  /**
  * Given an object of type Pokemon, reduce the number of balls by 1 and add the
  *  Pokemon to the list of ownedPokemon
  */
	void capture(Pokemon pokemon) {}

	/**
  * Given a number id of int type, if id is greater or equal to 0 and smaller
  * than the size of ownedPokemon, then return the Pokemon of index id on the list of owned
  * Pokemon. Otherwise, always return the first Pokemon in the list.
  * @param id
  * @return an instance of Pokemon
  */
	void choosePokemon(int id) {}
	// TIP: the method size() can be used for ArrayList to get the total number of items in it
	// TIP: For retrieving an Object from the List, use .get(index)
	// TIP: ArrayList always starts with index 0

	/**
  * Given a starterPokemon of Pokemon type, add the starterPokemon to the list of ownedPokemon
  * @param pokemon
  */
  void setStarterPokemon(Pokemon pokemon) {}
}
```

## So now we have
```java
class Trainer {
  // attributes, constructor and get methods here

	void capture(Pokemon pokemon) {
    numberOfPokeBalls = numberOfPokeBalls - 1;
    ownedPokemon.add(pokemon);
  }

	void choosePokemon(int id) {
    if (id >= 0 && id < ownedPokemon.size()) {
      return ownedPokemon.get(id);
    } else {
      System.out.println("Invalid ID. The first Pokemon will be chosen!");
      return ownedPokemon.get(0);
    }
  }

  void setStarterPokemon(Pokemon pokemon) {}
}
```

## Let's create our starter Pokemon collection
```java
class StarterPokemonCollection {
  // create three Pokemon: Charmander, Bulbasaur, and Squirtle.
  // TIP: the attributes should be static

  // Create a list of Pokemon starterPokemon (use static)

  static List<Pokemon> get() {
		// add the three Pokemon to the list created above and return the list
  }

	 /**
   * Given a number id of int type, if id is greater or equal to 0 and smaller
   * than the size of ownedPokemon, then return the Pokemon of index id on the list of owned
   * Pokemon. Otherwise, always return the first Pokemon in the list.
   * @param id
   * @return an instance of Pokemon
   */
	static Pokemon choosePokemon(int id) {}
}
```

## And our wild Pokemon
```java
class WildPokemon {

 	// create five constants for the names of the five wild    
 	// Pokemon: pidgey, caterpie, magikarp, ditto, and snorlax
 	// They will be used when creating the wild Pokemon objects

 	// Create five Pokemon objects : pidgey, caterpie, magikarp, ditto, and snorlax
 	// tip: the attributes should be static

}
```

# Homework
No specific homework this time!
Finish up your classes if you need to and polish them if you can think of any way to improve the logic.

---
Next Lesson: [Pokémon Code Academy part 2](lesson6.md)  
[Homepage](index.md)
