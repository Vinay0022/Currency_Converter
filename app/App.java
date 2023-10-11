package com.mycompany.app;

import java.util.Scanner;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    CurrentCurrency();
  }

  public static void CurrentCurrency() {
    Scanner in = new Scanner(System.in);
    System.out.println(" ");
    System.out.println("Please Select the Your Currency : ");
    System.out.print("1.USD ");
    System.out.print("2.INR ");
    System.out.print("3.JPY ");
    System.out.print("4.EUR ");
    System.out.println(" ");
    String value = in.nextLine();
    System.out.println(" ");
    ConCurrency(value, in);
  }

  public static void ConCurrency(String value, Scanner in) {
    System.out.println("Please Select the Currency You Want To Convert : 0=0");
    System.out.print("1.USD ");
    System.out.print("2.INR ");
    System.out.print("3.JPY ");
    System.out.print("4.EUR ");
    System.out.println(" ");
    String ConCur = in.nextLine();
    System.out.println(" ");

    if (value.equals("1") && ConCur.equals("1")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " USD in dollars = " + amount);
    }
    if (value.equals("1") && ConCur.equals("2")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " USD in ruppes = " + amount * 80);
    }
    if (value.equals("1") && ConCur.equals("3")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " USD in JPY = " + amount * 145.87374);
    }
    if (value.equals("1") && ConCur.equals("4")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " USD in dollars = " + amount);
    }
    if (value.equals("2") && ConCur.equals("1")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " INR in USD = " + amount / 80);
    }

    if (value.equals("2") && ConCur.equals("2")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " INR in INR = " + amount);
    }
    if (value.equals("2") && ConCur.equals("3")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " INR in JPY = " + amount * 1.7662893);
    }
    if (value.equals("2") && ConCur.equals("4")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " INR in EUR = " + amount * 0.011141585);
    }
    if (value.equals("3") && ConCur.equals("1")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " JPY in USD = " + amount * 0.006855963);
    }
    if (value.equals("3") && ConCur.equals("2")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " JPY in INR = " + amount * 0.56626778);
    }
    if (value.equals("3") && ConCur.equals("3")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " JPY in JPY = " + amount);
    }
    if (value.equals("3") && ConCur.equals("4")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " JPY in EUR = " + amount * 0.0063087606);
    }
    if (value.equals("4") && ConCur.equals("1")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " EUR in USD = " + amount * 1.0868151);
    }
    if (value.equals("4") && ConCur.equals("2")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " EUR in INR = " + amount * 89.766257);
    }
    if (value.equals("4") && ConCur.equals("3")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " EUR in USD = " + amount * 158.51892);
    }
    if (value.equals("4") && ConCur.equals("4")) {
      System.out.println("Enter the amount: ");
      float amount = in.nextInt();
      System.out.println(" ");
      System.out.println(amount + " EUR in USD = " + amount);
    }
    System.out.println(" ");
  }
}
