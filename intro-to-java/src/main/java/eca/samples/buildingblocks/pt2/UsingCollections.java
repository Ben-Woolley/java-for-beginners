package eca.samples.buildingblocks.pt2;

// Notice that we have to **import** these types, as they are not part of the core language
import java.util.List;
import java.util.Set;
import java.util.Map;

public class UsingCollections {
  public static void main(String[] args) {
    var listOfStrings = List.of("first element", "second element");
    System.out.println(listOfStrings);

    var setOfIntegers = Set.of(1, 2, 3);
    System.out.println(setOfIntegers);

    var mapFromStringToBoolean = Map.of(
        "this is true", true,
        "this is false", false
    );
    System.out.println(mapFromStringToBoolean);

  }
}