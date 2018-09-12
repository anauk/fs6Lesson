package cw180912;

public class PersonTest {

  public void  smartPrint() {
    System.out.println("I'm smart");
  }

  public static void main(String[] args) {

    PersonTest pt1 = new PersonTest ();
    pt1.smartPrint();

    Person p1 = new Person("Alex");
    Person p2 = new Person("Dima");
    Person p3 = new Person("Masha");
    Person p4 = new Person("Dasha");

    p1.print();
    System.out.println(Person.count);
    ((Person)null).print();

    p2.print();
    System.out.println(Person.count);

    p3.print();
    System.out.println(Person.count);

    p4.print();
    System.out.println(Person.count);
  }
}
