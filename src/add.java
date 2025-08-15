import java.util.Scanner;

public class add {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.print("Enter a num1:");
        int a = s.nextInt();
        System.out.print("Enter a num2:");
        int b = s.nextInt();
        int c = a+b;
        System.out.println("sum of the num "+c);
    }
}
