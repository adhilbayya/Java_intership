package day6;

public class ExceptionExample {
    public static void main(String[] args) {
        try{
            int num = 100/0;
            System.out.println(num);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
