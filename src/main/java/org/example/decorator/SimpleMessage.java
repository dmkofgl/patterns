package org.example.decorator;

public class SimpleMessage implements Notifier {

  @Override
  public void sendMessage(String m) {
    System.out.println("Simple message:" + m);
  }
}
