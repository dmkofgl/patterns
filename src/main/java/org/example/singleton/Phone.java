package org.example.singleton;

public class Phone {

  private static Phone instance;

  private Phone() {
  }


  public static Phone getInstance() {
    if (instance == null) {
      instance = new Phone();
    }
    return instance;
  }
}
