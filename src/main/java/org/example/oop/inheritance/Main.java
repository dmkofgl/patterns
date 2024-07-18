package org.example.oop.inheritance;

public class Main {

  public static void main(String[] args) {
    var obj = new ClassA();
    System.out.println(((InterfaceALower) obj).getA());
    var objB = new ClassB();
    System.out.println(((InterfaceALower) objB).getA());
  }
}