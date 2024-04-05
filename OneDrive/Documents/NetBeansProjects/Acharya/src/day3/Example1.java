package day3;

public class Example1 {
    public static void main(String[] args) {
        int age = 19;
        int weight = 40;
        if(age >= 18){
            if(weight > 50){
                System.out.println("You are eligible to donate blood");
            }else{
                System.out.println("You are not eligible to donate blood");
            }
        }else{
            System.out.println("You are under the age of 18 can't vote!");
        }
    }
}
