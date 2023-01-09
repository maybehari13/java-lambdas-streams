package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

//    Streams are immutable
//    Streams have intermediate / terminal methods (Lambda functions can be passed as method args)
//    Map, Sort, filter are intermediate methods examples.
//    Terminal methods should be at the end of the stream (eg: forEach)
    Integer[] scores = new Integer[]{80, 66, 73, 92, 43};
//    Stream<T> - Type of stream
    Stream<Integer> scoresStream = Arrays.stream(scores);

    List<String> shoppingList = new ArrayList<>();
    shoppingList.add("coffee");
    shoppingList.add("bread");
    shoppingList.add("pineapple");
    shoppingList.add("milk");
    shoppingList.add("pasta");

//    Stream from collection
    Stream<String> shoppingStream = shoppingList.stream();
//    using intermediate and terminal methods to process Streams
//    shoppingStream.sorted().forEach(item -> System.out.println(item));
//    Stream to change values to upper case + filter by 
//    shoppingStream.sorted()
//            .map(item -> item.toUpperCase())
//            .filter(item -> item.startsWith("P"))
//            .forEach(item -> System.out.println(item));
//    Stream can only be used once - can perform operations on objects not modify them
//    To save stream results to a new collection use COLLECT method)
    List<String> processedStream = shoppingStream.sorted()
            .map(item -> item.toUpperCase())
            .filter(item -> item.startsWith("P"))
            .collect(Collectors.toList());

    System.out.println(processedStream);
//    Direct stream creation
    Stream<String> letterStream = Stream.of("a", "b", "c");
  }
}
