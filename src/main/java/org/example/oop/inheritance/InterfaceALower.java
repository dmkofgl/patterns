package org.example.oop.inheritance;

public interface InterfaceALower {

  default String getA() {
    return "a";
  }
}
