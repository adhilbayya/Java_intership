package day5;

public class Abstraction {
    public static void main(String[] args) {
        Afeef  af = new Afeef();
        af.eat();
        af.study();
        af.sleep();
    }
}

abstract class Person{
    void sleep(){
        System.out.println("Sleeping");
    }
    void eat(){
        System.out.println("Eating");
    }
    abstract void study();
}

class Afeef extends Person{
    void study(){
        System.out.println("Studying");
    }
}
