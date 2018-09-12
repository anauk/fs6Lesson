package cw180912;

public class Ex01 {

  public static int a;
  public int b;
  public int c;

  public Ex01() {
    a++;
    b++;
    c = a + b;
  }

  public static void main(String[] args) {
    Ex01 app0 = new Ex01();
    System.out.println(app0.a);

    Ex01 app1 = new Ex01();
    System.out.println(app1.b);

    Ex01 app2 = new Ex01();
    System.out.println(app2.c);
  }
}