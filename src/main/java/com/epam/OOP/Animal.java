package com.epam.OOP;

public class Animal {

  private final String color;
  private final int numberOfPaws;
  private final boolean hasFur;

  public Animal (String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }

  public String getDescription () {
    String message;
    if (hasFur) {
      message = "This animal is mostly " + this.color + ". It has " + this.numberOfPaws
          + " paws and a fur.";
    } else {
      message = "This animal is mostly " + this.color + ". It has " + this.numberOfPaws
          + " paws and no fur.";
    }
    return message;
  }
}
