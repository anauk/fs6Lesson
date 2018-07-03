package cw180624.solutions;

public class StringsTroina {
  public static void main(String[] args) {
    String testString = "Proper UPPERCASE lowercase";

    String line = "Lorem i dolor sit amet";
    char[] ar = line.toCharArray();
    int tr = 0;

    for (int i = 0; i < ar.length; i++) {
      if (i == ar.length - 1) {
        if (ar[i] != ' ' && tr == 1) {
          ar[i] = lower(ar[i]);
        }
      } else if (tr == 0 && ar[i] != ' ' && ar[i + 1] != ' ') {
        ar[i] = upper(ar[i]);
        tr = 1;
      } else if (tr == 1 && ar[i] != ' ') {
        ar[i] = lower(ar[i]);
      } else if (ar[i] == ' ') {
        tr = 0;
      }
    }
    System.out.println(new String(ar));
  }

  static char upper(char c) {
    return (((int) c > 96) && ((int) c < 123)) ? ((char) ((int) c - 32)) : c;
  }

  static char lower(char c) {
    return (((int) c > 64) && ((int) c < 91)) ? ((char) ((int) c + 32)) : c;
  }
}
