/*
  Klasse enth�lt Methoden um von der Konsole zu lesen.
  Author: Tim Nier
*/
import java.util.*;
public class Console {
  // Methode liest int und behandelt Fehler.
  public static int readInt(){
    Scanner sc = new Scanner(System.in);
    int i = 0;
    boolean ok = false;
    while (!ok) {
      try {
        i = sc.nextInt();
        ok = true;
      } catch (Exception e) {
        System.out.println("Falsche Eingabe!");
        sc.nextLine();
      }
    }
    return i;
  }
  // Methode liest double und behandelt Fehler.
  public static double readDouble(){
    Scanner sc = new Scanner(System.in);
    double d = 0;
    boolean ok = false;
    while (!ok) {
      try {
        d = sc.nextDouble();
        ok = true;
      } catch (Exception e) {
        System.out.println("Falsche Eingabe!");
        sc.nextLine();
      }
    }
    return d;
  }
  // Methode liest Strings und konvertiert zu char, wenn dieser nur ein Zeichen lang ist.
  public static char readChar() {
    Scanner sc = new Scanner(System.in);
    String read = null;
    boolean ok = false;
    while (!ok) {
      read = sc.nextLine();
      if (read.length() == 1) {
         ok = true;
      } else {
        System.out.println("Falsche eingabe!");
      }
    }
    return read.charAt(0);
  }
  // Methode liest String.
  public static String read() {
    Scanner sc = new Scanner(System.in);
    String read = sc.nextLine();
    return read;
  }

  public static char[] readCharSequence() {
    Scanner sc = new Scanner(System.in);
    String read = sc.nextLine();
    int l = read.length();
    char[] c = new char[l];

    for (int i = 0; i < l; i++) {
      c[i] = read.charAt(i);
    }
    return c;
  }
}
