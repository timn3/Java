import java.util.Scanner;
public class readChar {
  /*
  readChar is a method which checks if a given String is one char long and if it contains the same value as a given Array.
  The Array has to be included while calling the method.
  */
  public static char readChar(String[] chars) {
    Scanner sc = new Scanner(System.in);
    String read = null;
    
    outerloop:
    while(true) {  
      read = sc.next();
        for (int i = 0; i < read.length(); i++) {
          if (read.length() == 1 && read.contains(chars[i])){
            break outerloop;
          }   
        }
      System.out.println("Wrong input");
      }
    return read.charAt(0);
  }
  
  public static void main(String[] args) {
    readChar(/*Array*/);
  }

}                                                                                                                                    
