package com.example;

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

//    Convert to Lambda - () Args ; -> fn output
    Greeting greeting3 = () -> System.out.println("Hello from Lambda");
    greeting3.sayHello();

  }

}
