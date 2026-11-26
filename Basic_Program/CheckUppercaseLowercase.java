import java.util.Scanner;

public class CheckUppercaseLowercase {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the character:");
        char letter = read.next().charAt(0);

        if (Character.isLowerCase(letter)) {
            System.out.println("This character is Lower Case");
        }else if (Character.isUpperCase(letter)) {
            System.out.println("This character is Upper Case");
        }else{
            System.out.println("This is not a character");
        }
    }
}
