package day5;

public class ImplementsExample {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        System.out.println(d.id);
    }
   
}
interface Showable{
    int id = 123;
    void show();
}
class Demo implements Showable{
    public void show(){
        System.out.println("This is show method");
    }
}