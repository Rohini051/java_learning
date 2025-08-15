import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.print("Enter num:");
        int a = s.nextInt();
        if(a%3==0  && a%5==0)
            System.out.println("Rohini and Rahul");
        else if(a%5==0)
            System.out.println("Rahul");
        else if(a%3==0)
            System.out.println("Rohini");
        else
            System.out.println("the value is not divided");

    }
}
