package com.epam.loops;

public class Pyramid {

  public static void main (String[] args) {
    new Pyramid().printPyramid(7);
  }

  public void printPyramid (int cathetusLength) {
    for (int i = 0; i <= cathetusLength; i++) {
      for (int j = cathetusLength - i; j > 1; j--) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

}
