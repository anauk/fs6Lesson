package cw180912;

public class Person {
  private final String name;
  public static int count;

  public Person(String name) {
    this.name = name;
    count++;
  }

  public void print() {
    System.out.println(name);;
  }
}
