import java.util.*;

/**
 * PositiveNegativeZero
 */
public class PositiveNegativeZero {

    public static void main(String[] args) {
        System.out.println("Enter N value:");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();


        if(n==0){
            System.out.println("Is Zero");
        }else if(n>0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }
    }
}