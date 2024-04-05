package day6;

public class ArrayExample {
    public static void main(String[] args) {
        int num[] = {100, 200, 300, 400, 800, 600, 700};
        int max = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] < max){
                max = num[i];   
            }
        }
        System.out.println(max);
    }
}
