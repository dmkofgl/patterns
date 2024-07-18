package org.example.builder;

public class HouseBuilderImpl implements HouseBuilder {

  private House house = new House();

  @Override
  public void reset() {
    house = new House();
  }

  @Override
  public void addGarage(String g) {
    house.setGarage(g);
  }

  @Override

  public void addGarden(String g) {
    house.setGarden(g);
  }

  @Override
  public void addWindows(String w) {
    house.setWindows(w);
  }

  @Override
  public House build() {
    return house;
  }
}
