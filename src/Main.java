import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();//first number podanum
        int b = s.nextInt();//second num podanum
        if(a>b)
            System.out.println("a is greater");
        else
            System.out.println("b is greater");
    }
}
