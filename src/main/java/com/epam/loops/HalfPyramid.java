package com.epam.loops;

public class HalfPyramid {

  public static void main (String[] args) {
    new HalfPyramid().printHalfPyramid(8);
  }

  public void printHalfPyramid (int cathetusLength) {
    for (int i = 0; i < cathetusLength; i++) {
      for (int j = cathetusLength - i; j > 1; j--) {
        System.out.print(" ");
      }

      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
