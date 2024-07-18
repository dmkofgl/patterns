package org.example.adapter;

public class RoundPeg implements RoundPegInterface {

  public int getRadius() {
    return radius;
  }

  private int radius;

  public RoundPeg(int radius) {
    this.radius = radius;
  }
}
