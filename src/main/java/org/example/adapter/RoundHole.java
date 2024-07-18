package org.example.adapter;

public class RoundHole {

  public int getRadius() {
    return radius;
  }

  private int radius;

  public RoundHole(int radius) {
    this.radius = radius;
  }

  public boolean isFit(RoundPegInterface peg) {
    return this.radius >= peg.getRadius();
  }
}
