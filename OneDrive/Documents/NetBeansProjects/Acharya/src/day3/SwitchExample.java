package day3;

public class SwitchExample {
    public static void main(String[] args) {
        char letter = 't';
        switch(letter){
            case 'a':
                System.out.println("a is a Vowel");
                break;
            case 'e':
                System.out.println("e is a Vowel");
                break;
                
            case 'i':
                System.out.println("i is a Vowel");
                break;
                
            case 'o':
                System.out.println("o is a Vowel");
                break;
                
            case 'u':
                System.out.println("u is a Vowel");
                break;
                
            default:
                System.out.println(letter+ "is a Consonant");
                break;
        }
    }
}
