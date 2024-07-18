package org.example.oop.inheritance;

public class ClassA implements InterfaceA, InterfaceALower{

  @Override
  public String getA() {
    return InterfaceA.super.getA();
  }
}
