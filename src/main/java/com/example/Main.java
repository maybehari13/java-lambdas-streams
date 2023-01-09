package com.example;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {

  public static void main(String[] args) {

    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();

//    Better way for implementing Fn Interfaces , Directly create obj and override the fn
    Greeting greeting2 = new Greeting() {
      @Override
      public void sayHello() {
        System.out.println("Hello World");
      }
    };
    greeting2.sayHello();

//    Lambda Syntax:: Declare fn obj; () Args ; -> fn output ; call method from obj
    Greeting greeting3 = () -> System.out.println("Hello from Lambda");
    greeting3.sayHello();

    Calculator calc = (int x, int y) -> {
      Random random = new Random ();
      int nextRandom = random.nextInt(50);
      return x + y + nextRandom;
    };
    System.out.println(calc.calculate(1,5));

//    Java.util.function => java ready-made interface package for Lambdas
    IntBinaryOperator calculate = (x, y) -> {
      Random random = new Random ();
      int nextRandom = random.nextInt(50);
      return x + y + nextRandom;
    };
    System.out.println(calculate.applyAsInt(1,5));
  }

}
