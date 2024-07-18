package org.example.decorator;

public class Main {

  public static void main(String[] args) {
    var message = new SimpleMessage();
    var emailDecorator = new EmailDecorator(message);
    var smsDecorator = new SmsDecorator(emailDecorator);
    smsDecorator.sendMessage("TEST message");
  }
}