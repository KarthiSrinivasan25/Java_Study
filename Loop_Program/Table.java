package Loop_Program;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int Number = read.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(Number+"x"+i+"="+Number*i);
        }
    }
}
