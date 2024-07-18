package org.example.decorator;

public class BaseDecorator implements Notifier {

  private Notifier notifier;

  public BaseDecorator(Notifier notifier) {
    this.notifier = notifier;
  }

  @Override
  public void sendMessage(String m) {
    if (notifier != null) {
      notifier.sendMessage(m);
    }
  }
}
