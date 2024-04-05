package day5;

public class PolymorphismExample {
    public static void main(String[] args) {
        System.out.println(Adder.add(2, 10));
    }
}
class Adder{
    static int add(int a, int b){
        return a + b;
    }
}

class sub extends Adder{
    static int add(int a, int b){
        return a - b;
    }
}
