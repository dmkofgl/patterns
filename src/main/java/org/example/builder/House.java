package org.example.builder;

public class House {

  private String garage;
  private String garden;
  private String windows;

  public void output() {
    System.out.println("GARAGE: " + garage);
    System.out.println("GARDEN: " + garden);
    System.out.println("WINDOWS: " + windows);
  }

  public void setGarage(String garage) {
    this.garage = garage;
  }

  public void setGarden(String garden) {
    this.garden = garden;
  }

  public void setWindows(String windows) {
    this.windows = windows;
  }
}
