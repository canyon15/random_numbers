
import java.util.Scanner;
// Main is just used to test Random.
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        Random rum = new Random(0, 1);
        int r = rum.getNumber();
        System.out.println("0-1: " + r);
        Random num = new Random(0, 3);
        int n = num.getNumber();
        System.out.println("0-3: " + n);
        Random aum = new Random(3, 5);
        int a = aum.getNumber();
        System.out.println("3-5: " + a);
        Random zum = new Random(13, 37);
        int z = zum.getNumber();
        System.out.println("13-37: " + z);
        Random pum = new Random(-8, 0);
        int p = pum.getNumber();
        System.out.println("-8-0: " + p);
        Random lum = new Random(7, -3);
        int l = lum.getNumber();
        System.out.println("7--3: " + l);
        // try numbers at run time.
        int low = 0;
        System.out.println("Get a random number between: ");
        low = in.nextInt();
        int high = 0;
        System.out.println("and: ");
        high = in.nextInt();
        Random userNum = new Random(low, high);
        int uN = userNum.getNumber();
        System.out.println("Your random number is: " + uN);


        in.close();        
        
    }
}
