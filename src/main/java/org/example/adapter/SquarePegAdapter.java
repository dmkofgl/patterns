package org.example.adapter;

public class SquarePegAdapter implements RoundPegInterface {

  private SquarePeg squarePeg;

  public SquarePegAdapter(SquarePeg squarePeg) {
    this.squarePeg = squarePeg;
  }

  @Override
  public int getRadius() {
    return (int) (squarePeg.getWidth() * Math.sqrt(2) / 2);
  }
}
