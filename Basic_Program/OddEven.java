import java.util.*;

class OddEven{
    public static void main(String[] args){
        System.out.println("Enter N value:");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        if(n%2==0){
            System.out.print("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    } 
}