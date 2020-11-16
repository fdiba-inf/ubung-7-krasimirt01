package exercise7;

import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = input.nextInt();

    for (int a = 1; a <= n; a++) {
      for (int b = 1; b <= a; b++) {
        if (a == b) {
          System.out.print(b);
        } else {
          System.out.print(b + " ");
        }
      }
      System.out.println();
    }

    for (int c = n - 1; c >= 1; c--) {
      for (int d = 1; d <= c; d++) {
        if (c == d) {
          System.out.print(d);
        } else {
          System.out.print(d + " ");
        }
      }
      System.out.println();
    }
  }
}
