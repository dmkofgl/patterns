package org.example.adapter;

public class Main {

  public static void main(String[] args) {
    var hole = new RoundHole(10);
    var rPeg = new RoundPeg(9);
    var sPeg = new SquarePeg(20);
    var adapter = new SquarePegAdapter(sPeg);
    var sPegSuit = new SquarePeg(5);
    var adapterSuit = new SquarePegAdapter(sPegSuit);

    System.out.println(hole.isFit(rPeg));
    System.out.println(hole.isFit(adapter));
    System.out.println(hole.isFit(adapterSuit));
  }
}