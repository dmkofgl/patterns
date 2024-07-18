package org.example.builder;

import org.example.adapter.RoundHole;
import org.example.adapter.RoundPeg;
import org.example.adapter.SquarePeg;
import org.example.adapter.SquarePegAdapter;

public class Main {

  public static void main(String[] args) {
    HouseBuilder builder = new HouseBuilderImpl();
    builder.addGarage("G");
    builder.addGarden("GN");
    builder.addWindows("WN");
    var house = builder.build();
    house.output();
  }
}