package org.example.oop.association;

public class CompositionExample {

  public static void main(String[] args) {
    var b = new B("TEST");
  }

  public static class A {

    public String getMessage() {
      return message;
    }

    private String message;

    public A(String message) {
      this.message = message;
    }
  }

  public static class B {

    private A a;

    public B(String message) {
      this.a = new A(message);
    }
  }
}
