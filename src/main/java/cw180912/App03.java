package cw180912;

public class App03 {
    public static int a;
    public int b;
    public int c;

    public App03() {
      a++;
      b++;
      c = a + b;
    }

    public static void main(String[] args) {
      App03 app0 = new App03();
      System.out.println(app0.c);

      App03 app1 = new App03();
      System.out.println(app1.c);

      App03 app2 = new App03();
      System.out.println(app2.c);
    }

  }