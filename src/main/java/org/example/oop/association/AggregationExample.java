package org.example.oop.association;

public class AggregationExample {

  public static void main(String[] args) {
    var a = new A("TEST");
    var b = new B(a);
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

    public B(A a) {
      this.a = a;
    }
  }
}
