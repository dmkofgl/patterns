package org.example.singleton;

public class Main {

  public static void main(String[] args) {
    var phone = Phone.getInstance();
    var phone2 = Phone.getInstance();
    System.out.println(phone2 == phone);
  }
}