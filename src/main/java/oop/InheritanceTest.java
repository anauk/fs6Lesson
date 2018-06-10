package oop;

public class InheritanceTest {
    public static void main(String[] args) {
        Human human = new Human();
        People people = new People();
        human.print();
        people.print();
        if (people instanceof People) System.out.println("people is people");
        if (people instanceof Human) System.out.println("people is human");
    }
}
