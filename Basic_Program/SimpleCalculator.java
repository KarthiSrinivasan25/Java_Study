import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter A value");
        int a = read.nextInt();
        System.out.println("Enter B value");
        int b = read.nextInt();
        System.out.println("Enter Operator");
        char operator = read.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a+b);                
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                 if ( b==0) {
                    System.out.println("Not divided by zero");
                    }else{
                System.out.println(a/b);
                    }
                break;
            case '%': if ( b==0) {
                    System.out.println("Not divided by zero");
                    }else{
                    System.out.println(a%b);
                    }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
