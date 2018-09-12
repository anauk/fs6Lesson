package cw180912;

public class Ex02 {
  public static int a;
  public int b;
  public int c;

  public Ex02() {
    a++;
    b++;
    c = a + b;
  }

  public static void main(String[] args) {
    Ex02 app0 = new Ex02();
    System.out.println(app0.c);
    Ex02 app1 = new Ex02();
    System.out.println(app1.b);
    Ex02 app2 = new Ex02();
    System.out.println(app2.a);
  }
}