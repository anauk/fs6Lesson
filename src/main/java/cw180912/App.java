package cw180912;

public class App {

  public static int a = 0;
  public int b = 0;

  public App() {
    this.b = ++a;
  }

  public static int get() {
    return a + new App().b;
  }

  public static void main(String[] args) {

    System.out.println(get());

    System.out.println(get());

    System.out.println(get());
  }
}