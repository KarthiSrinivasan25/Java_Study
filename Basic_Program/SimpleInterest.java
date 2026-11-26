import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        double p = read.nextDouble();
        System.out.println("Enter Rate of Interest");
        double i = read.nextDouble();
        System.out.println("Enter Time(in years)");
        double t = read.nextDouble();
        double si;
        

        si = (p*i*t)/100;

        System.out.println("SI: " + si);
    }
}
