package org.example.decorator;

public class EmailDecorator extends BaseDecorator {

  public EmailDecorator(Notifier notifier) {
    super(notifier);
  }

  @Override
  public void sendMessage(String m) {
    super.sendMessage(m);
    sendSms(m);
  }

  private void sendSms(String m) {
    System.out.println("Send email: " + m);
  }
}
