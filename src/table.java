import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=0;i<11;i++){
            System.out.println(i+"x"+a+"="+i*a);
        }

    }
}
