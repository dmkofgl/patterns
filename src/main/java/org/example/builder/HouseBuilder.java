package org.example.builder;

public interface HouseBuilder {


  void reset();

  void addGarage(String g);

  void addGarden(String g);

  void addWindows(String w);

  House build();
}
