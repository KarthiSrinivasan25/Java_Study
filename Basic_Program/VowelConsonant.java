import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a Character");
        char letter = read.next().charAt(0);

        if ((letter=='a' || letter=='A') || (letter=='e' || letter=='E') || (letter=='i' || letter=='I') || (letter=='o' || letter=='O') || (letter=='u' || letter=='U')) {
            System.out.println("This letter is Vowel");
        }else{
            System.out.println("This letter is Consonant");
        }
    }
}
